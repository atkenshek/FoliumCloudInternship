package cloud.folium.internship.patterns.creational.abstractfactory;

public abstract class AbstractFactory {
    abstract IShape getShape(String shape);
    abstract IShape fillColor(String color);

}