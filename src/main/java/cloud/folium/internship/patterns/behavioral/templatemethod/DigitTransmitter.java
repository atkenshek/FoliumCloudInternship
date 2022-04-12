package cloud.folium.internship.patterns.behavioral.templatemethod;

public class DigitTransmitter extends Transmitter{
    @Override
    protected void simpling() {
        System.out.println("Simpling of the recorded fragment");
    }

    @Override
    protected void digitization() {
        System.out.println("Digitization...");
    }

    @Override
    protected void modulation() {
        System.out.println("Modulation of digital alert...");
    }
}
