package br.com.fatecmogidascruzes.gallery.service.web.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = AlbumCoverMustHaveDescriptionValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AlbumCoverMustHaveDescription {

	String message() default "A descrição alternativa da capa é obrigatória por questão de acessibilidade para deficientes visuais";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
