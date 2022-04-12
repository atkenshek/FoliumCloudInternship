package cloud.folium.internship.patterns.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        IShape shapeCircle = shapeFactory.getShape("Circle");
        shapeCircle.drawShape();
        IShape ellipse = shapeFactory.getShape("Ellipse");
        ellipse.drawShape();

        IShape shapeRectangle = shapeFactory.getShape("Rectangle");
        shapeRectangle.drawShape();


        IShape shapeSquare = shapeFactory.getShape("Square");
        shapeSquare.drawShape();
    }
}
