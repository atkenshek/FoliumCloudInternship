package cloud.folium.internship.patterns.behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {

        Transmitter analogTransmitter = new AnalogTransmitter();
        analogTransmitter.processStart();
        System.out.println();

        Transmitter digitalTransmitter = new DigitTransmitter();
        digitalTransmitter.processStart();
    }
}
