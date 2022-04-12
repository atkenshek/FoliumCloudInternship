package cloud.folium.internship.patterns.behavioral.templatemethod;

public class AnalogTransmitter extends Transmitter {
    @Override
    protected void modulation() {
        System.out.println("Modulation of analog alerts...");
    }
}
