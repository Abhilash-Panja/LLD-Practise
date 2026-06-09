package service;

import strategy.PaymentMethod;

public class PaymentService {

    public void processPayment(PaymentMethod paymentMethod){
        paymentMethod.pay();
    }
}
