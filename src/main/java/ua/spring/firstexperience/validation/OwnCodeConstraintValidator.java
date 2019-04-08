package ua.spring.firstexperience.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OwnCodeConstraintValidator implements ConstraintValidator<OwnCode, String>{

    private String ownPrefix;

    @Override
    public void initialize( OwnCode theOwnCode ) {
        ownPrefix=theOwnCode.value();
    }

    @Override
    public boolean isValid( String theCode, ConstraintValidatorContext constraintValidatorContext ) {
        boolean result;
        if (theCode !=null){
            result = theCode.startsWith(ownPrefix);
        }else {
            result = true;
        }
        return result;
    }
}
