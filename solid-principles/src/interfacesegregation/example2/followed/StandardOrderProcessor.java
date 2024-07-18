package interfacesegregation.example2.followed;

public class StandardOrderProcessor implements OrderProcessing, PaymentProcessing, InventoryManagement, InvoiceGeneration, CustomerCommunication, Shipping {

    @Override
    public void sendOrderConfirmation(Order order) {
        // implementation
    }

    @Override
    public void updateInventory(Order order) {
        // implementation
    }

    @Override
    public void generateInvoice(Order order) {
        // implementation
    }

    @Override
    public void processOrder(Order order) {
        // implementation
    }

    @Override
    public void cancelOrder(Order order) {
        // implementation
    }

    @Override
    public void processPayment(Order order) {
        // implementation
    }

    @Override
    public void refundOrder(Order order) {
        // implementation
    }

    @Override
    public void shipOrder(Order order) {
        // implementation
    }
}
