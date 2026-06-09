package service.impl;

import strategy.PaymentMethod;

public class PayPal implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment Done through PayPal");
    }
}
