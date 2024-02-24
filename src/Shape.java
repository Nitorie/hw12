public abstract class Shape {
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void move(int deltaX, int deltaY);
    public abstract void resize(int newWidth, int newHeight);
    public abstract void draw();
}