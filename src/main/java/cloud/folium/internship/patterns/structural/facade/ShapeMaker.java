package cloud.folium.internship.patterns.structural.facade;

public class ShapeMaker {
    private IShape circle;
    private IShape rectangle;
    private IShape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.drawShape();
    }
    public void drawRectangle(){
        rectangle.drawShape();
    }
    public void drawSquare(){
        square.drawShape();
    }
}
