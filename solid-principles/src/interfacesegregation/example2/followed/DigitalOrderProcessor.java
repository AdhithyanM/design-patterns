package interfacesegregation.example2.followed;

public class DigitalOrderProcessor implements OrderProcessing, PaymentProcessing, InvoiceGeneration, CustomerCommunication {
    @Override
    public void sendOrderConfirmation(Order order) {
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
}
