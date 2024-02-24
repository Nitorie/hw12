public class Rectangle extends Shape {
    protected int width;
    protected int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void move(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    @Override
    public void resize(int newWidth, int newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }
}