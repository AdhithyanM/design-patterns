package interfacesegregation.example2.notfollowed;

/*
    we have a single OrderProcessor interface that contains methods for all aspects of order processing.
    This violates the Interface Segregation Principle because:
     - It forces implementers to provide implementations for methods they might not need (e.g., shipOrder for digital products).
     - It mixes concerns that could be separated (e.g., payment processing, shipping, inventory management).
     - It makes the interface less flexible and harder to maintain.
 */
public interface OrderProcessor {
    void processOrder(Order order);
    void refundOrder(Order order);
    void shipOrder(Order order);
    void generateInvoice(Order order);
    void sendOrderConfirmation(Order order);
    void updateInventory(Order order);
    void processPayment(Order order);
    void cancelOrder(Order order);
}
