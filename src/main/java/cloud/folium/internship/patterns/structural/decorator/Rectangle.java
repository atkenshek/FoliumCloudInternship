package cloud.folium.internship.patterns.structural.decorator;

public class Rectangle implements IShape {

    @Override
    public void drawShape() {
        System.out.println("IShape: Rectangle");
    }

}