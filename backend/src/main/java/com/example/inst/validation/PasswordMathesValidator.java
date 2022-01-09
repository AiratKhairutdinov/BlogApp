package com.example.inst.validation;

import com.example.inst.annotation.PasswordMathes;
import com.example.inst.payload.request.SignupRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class PasswordMathesValidator implements ConstraintValidator<PasswordMathes, Object>{

    @Override
    public void initialize(PasswordMathes constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext constraintValidatorContext) {
        SignupRequest userSignupRequest = (SignupRequest) obj;
        return userSignupRequest.getPassword().equals(userSignupRequest.getConfirmPassword());
    }
}
