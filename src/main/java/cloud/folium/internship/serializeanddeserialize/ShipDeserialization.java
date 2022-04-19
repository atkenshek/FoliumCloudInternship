package cloud.folium.internship.serializeanddeserialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ShipDeserialization {
    private static final String FILE_LOCATION = "serialized/ship.ser";


    public Ship deserialize(){
        Ship shipFromFile = null;

        try{
            FileInputStream fileIn =
                    new FileInputStream(FILE_LOCATION);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            shipFromFile = (Ship) objectIn.readObject();
            objectIn.close();
            fileIn.close();
        }catch(IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        return shipFromFile;
    }
}
