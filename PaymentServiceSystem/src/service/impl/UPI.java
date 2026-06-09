package service.impl;

import strategy.PaymentMethod;

public class UPI implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment Done through UPI");
    }
}
