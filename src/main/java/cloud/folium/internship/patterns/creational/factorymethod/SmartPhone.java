package cloud.folium.internship.patterns.creational.factorymethod;

public abstract class SmartPhone {
    public abstract String getModelName();

    public String toString(){
        return "Model: " + this.getModelName();
    }
}