package cloud.folium.internship.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {

        IShape circle = new Circle();

        IShape redCircle = new RedShapeDecorator(new Circle());

        IShape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.drawShape();

        System.out.println("\nCircle of red border");
        redCircle.drawShape();

        System.out.println("\nRectangle of red border");
        redRectangle.drawShape();
    }
}
