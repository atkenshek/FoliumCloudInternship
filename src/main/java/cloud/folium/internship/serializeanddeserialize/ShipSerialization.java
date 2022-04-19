package cloud.folium.internship.serializeanddeserialize;

import java.io.*;

public class ShipSerialization {
    private final Ship ship;
    private static final String FILE_LOCATION = "cloud/folium/internship/serializeanddeserialize/serialized/ship.ser";

    public ShipSerialization(Ship ship) {
        this.ship = ship;
    }

    public void serialize(){
        try{
            FileOutputStream fileOut = new FileOutputStream(FILE_LOCATION);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(ship);
            out.close();
            fileOut.close();
        } catch(IOException e){
            throw new RuntimeException("Could not serialize ship", e);
        }
    }


}
