package com.patterns.abstact.factory.amex;

import com.patterns.abstact.factory.CardType;
import com.patterns.abstact.factory.CreditCard;
import com.patterns.abstact.factory.CreditCardFactory;
import com.patterns.abstact.factory.Validator;
import com.patterns.abstact.factory.amex.card.Gold;
import com.patterns.abstact.factory.amex.card.Platinum;

public class Factory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new Gold();
            case PLATINUM:
                return new Platinum();
            default:
                break;
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new ValidatorImpl();
    }
}
