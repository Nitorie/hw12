public class Circle extends Shape {
    protected int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void move(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    @Override
    public void resize(int newWidth, int newHeight) {
        this.radius = Math.min(newWidth, newHeight) / 2; // Принимаем минимальное из значений ширины и высоты в качестве радиуса
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle at (" + x + ", " + y + ") with radius " + radius);
    }
}