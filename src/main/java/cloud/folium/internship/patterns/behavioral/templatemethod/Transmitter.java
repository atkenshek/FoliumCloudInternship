package cloud.folium.internship.patterns.behavioral.templatemethod;

public abstract class Transmitter {
    protected void voiceRecorder(){
        System.out.println("Recording a voice...");
    }

    protected void simpling(){

    }

    protected void digitization(){}
    protected void modulation(){}
    protected void transmission(){
        System.out.println("Sending an alert...");
    }

    public void processStart(){
        voiceRecorder();
        simpling();
        digitization();
        modulation();
        transmission();
    }
}
