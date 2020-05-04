package com.patterns.abstact.factory;


public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        return creditScore > 650 ? new com.patterns.abstact.factory.amex.Factory() : new com.patterns.abstact.factory.visa.Factory();
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);

}