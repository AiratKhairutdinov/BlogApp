package com.example.inst.annotation;

import com.example.inst.validation.PasswordMathesValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMathesValidator.class)
@Documented
public @interface PasswordMathes {

    String message() default "Password does not match";

    Class<?>[] groups() default{};

    Class<? extends Payload>[] payload() default{};

}
