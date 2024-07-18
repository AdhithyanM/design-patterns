package interfacesegregation.example2.notfollowed;

public class DigitalOrderProcessor implements OrderProcessor {
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
        // Digital Products don't need shipping
        throw new UnsupportedOperationException("Digital products are not shipped");
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
        // Digital products might not need inventory updates
        // But we are forced to implement this method.
        throw new UnsupportedOperationException("Digital products doesn't require inventory update");
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
