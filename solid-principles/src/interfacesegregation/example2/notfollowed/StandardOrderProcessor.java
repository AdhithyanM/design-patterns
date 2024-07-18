package interfacesegregation.example2.notfollowed;

public class StandardOrderProcessor implements OrderProcessor {
    @Override
    public void processOrder(Order order) {
        // Implementation
    }

    @Override
    public void refundOrder(Order order) {
        // Implementation
    }

    @Override
    public void shipOrder(Order order) {
        // Implementation
    }

    @Override
    public void generateInvoice(Order order) {
        // Implementation
    }

    @Override
    public void sendOrderConfirmation(Order order) {
        // Implementation
    }

    @Override
    public void updateInventory(Order order) {
        // Implementation
    }

    @Override
    public void processPayment(Order order) {
        // Implementation
    }

    @Override
    public void cancelOrder(Order order) {
        // Implementation
    }
}
