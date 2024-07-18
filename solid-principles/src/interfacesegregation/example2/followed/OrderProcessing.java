package interfacesegregation.example2.followed;

// Core order processing operations
public interface OrderProcessing {
    void processOrder(Order order);
    void cancelOrder(Order order);
}
