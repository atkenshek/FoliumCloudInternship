package cloud.folium.internship.patterns.structural.facade;

public class Square implements IShape {

    @Override
    public void drawShape() {
        System.out.println("IShape: Square");
    }

}