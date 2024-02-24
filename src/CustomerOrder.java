import java.util.List;

class CustomerOrder extends Order {
    private Customer customer;

    public CustomerOrder(List<Product> products, String deliveryAddress, boolean paymentStatus, Customer customer) {
        super(products, deliveryAddress, paymentStatus);
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Order:\n");
        for (Product product : getProducts()) {
            result.append("Product name = ").append(product.getName()).append(", Price = ").append(product.getPrice()).append("\n");
            result.append("Email = ").append(product.getEmail()).append(", Address = ").append(product.getAddress()).append("\n");
        }
        result.append("Payment Status: ").append(isPaymentStatus()).append("\n");
        return result.toString();
    }
}