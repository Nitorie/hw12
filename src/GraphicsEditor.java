import java.util.ArrayList;
import java.util.List;

public class GraphicsEditor {
    private List<Shape> shapes;

    public GraphicsEditor() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void moveShape(int index, int deltaX, int deltaY) {
        if (index >= 0 && index < shapes.size()) {
            shapes.get(index).move(deltaX, deltaY);
        }
    }

    public void resizeShape(int index, int newWidth, int newHeight) {
        if (index >= 0 && index < shapes.size()) {
            shapes.get(index).resize(newWidth, newHeight);
        }
    }

    public void drawShapes() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}