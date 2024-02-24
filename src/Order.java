import java.util.List;

class Order {
    List<Product> products;
    String deliveryAddress;
    boolean paymentStatus;

    public Order(List<Product> products, String deliveryAddress, boolean paymentStatus) {
        this.products = products;
        this.deliveryAddress = deliveryAddress;
        this.paymentStatus = paymentStatus;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }


    @Override
    public String toString() {
        String result = "Order:\n";
        for (Product product : products) {
            result += "Product name = " + product.getName() + ", Price = " + product.getPrice() + "\n";
        }
        result += "Delivery Address: " + deliveryAddress + "\n";
        result += "Payment Status: " + paymentStatus + "\n";
        return result;
    }
}