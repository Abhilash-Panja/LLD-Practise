import service.PaymentService;
import service.impl.UPI;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService();
        paymentService.processPayment(new UPI());
    }
}
