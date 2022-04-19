package cloud.folium.internship.serializeanddeserialize;

import java.io.Serializable;

public class Ship implements Serializable {
    private String model;
    private String fuel;
    private String captain;

    public Ship() {
    }

    public Ship(String model, String fuel, String captain) {
        this.model = model;
        this.fuel = fuel;
        this.captain = captain;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }
}
