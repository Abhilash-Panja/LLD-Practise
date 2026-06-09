package service.impl;

import strategy.PaymentMethod;

public class Card implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment Done through card");
    }
}
