package ua.spring.firstexperience.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = OwnCodeConstraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OwnCode {
    //define default own code
    public String value() default  "Go";

    //define default error message
    public  String message() default "must start with Go";

    //define default groups
    public Class<?>[] groups() default {};

    //define default payloads
    public  Class<? extends Payload>[] payload() default {};
}
