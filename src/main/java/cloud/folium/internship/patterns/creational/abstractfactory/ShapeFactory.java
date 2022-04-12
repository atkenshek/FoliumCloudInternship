package cloud.folium.internship.patterns.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {
    public IShape getShape(String shape){

        if(shape ==null)
            return null;
        if(shape .equalsIgnoreCase("Circle"))
            return new Circle();
        else if (shape.equalsIgnoreCase("Ellipse"))
            return new Ellipse();
        else if(shape .equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if(shape .equalsIgnoreCase("Square"))
            return new Square();

        return null;

    }

    @Override
    IShape fillColor(String color) {
        // This is an unused method
        return null;
    }
}
