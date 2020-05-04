package com.patterns.abstact.factory.amex;

import com.patterns.abstact.factory.CreditCard;
import com.patterns.abstact.factory.Validator;

public class ValidatorImpl implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }

}