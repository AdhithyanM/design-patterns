package interfacesegregation.example2.followed;

// Payment-related operations
public interface PaymentProcessing {
    void processPayment(Order order);
    void refundOrder(Order order);
}
