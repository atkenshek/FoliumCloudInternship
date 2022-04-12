package cloud.folium.internship.patterns.structural.bridge;

public class Main {

    public static void main(String[] args) { //So, the relationship between IShape and ShapeBridge is called a Bridge.
        ShapeBridge square = new ShapeB(new Square());
        ShapeBridge triangle = new ShapeB(new Triangle());
        square.drawShape_ShapeBridge();
        System.out.println("test..");
        triangle.drawShape_ShapeBridge();

        ShapeBridge blueTriangle = new Color(new BlueTriangle());

        blueTriangle.iShape.shapeType_IShape();
        blueTriangle.iShape.shapeColor_IShape();

        ShapeBridge redTriangle = new Color(new RedTriangle());



        redTriangle.iShape.shapeType_IShape();
        redTriangle.iShape.shapeColor_IShape();
    }
}