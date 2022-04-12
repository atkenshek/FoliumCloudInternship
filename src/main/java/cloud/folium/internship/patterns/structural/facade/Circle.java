package cloud.folium.internship.patterns.structural.facade;

public class Circle implements IShape {

    @Override
    public void drawShape() {
        System.out.println("IShape: Circle");
    }

}