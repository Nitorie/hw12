public class Customer {
    private String name;
    private String gmail;
    public Customer(String name, String gmail) {
        this.name = name;
        this.gmail = gmail;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", gmail='" + gmail + '\'' +
                '}';
    }
}
