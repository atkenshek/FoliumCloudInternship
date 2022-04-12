package cloud.folium.internship.patterns.structural.facade;

public class Rectangle implements IShape {

    @Override
    public void drawShape() {
        System.out.println("IShape: Rectangle");
    }

}