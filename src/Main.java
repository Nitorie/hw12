import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        GraphicsEditor editor = new GraphicsEditor();


        Rectangle rectangle = new Rectangle(10, 20, 30, 40);
        Circle circle = new Circle(50, 60, 25);

        editor.addShape(rectangle);
        editor.addShape(circle);

        System.out.println("Before: ");
        rectangle.draw();
        circle.draw();

        editor.moveShape(0, 5, 5);
        editor.resizeShape(1, 30, 30);

        System.out.println("After:");
        editor.drawShapes();

        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 1499.99, 1, "gmail1@gmail.com", "123.Wolk Street"));
        products.add(new Product("Laptop", 899.99, 3, "email2@email.com", "Krutaya ulica 22"));

        Customer customer = new Customer("chelovek", "chelovek@gmail.com");

        CustomerOrder customerOrder = new CustomerOrder(products, "falom. Main St", false, customer);

        System.out.println(customerOrder);
    }
}