package cloud.folium.internship.patterns.creational.factorymethod;

public class Samsung extends SmartPhone{
    private String modelName;

    Samsung(String modelName){
        this.modelName = modelName;
    }

    @Override
    public String getModelName() {
        return this.modelName;
    }
}