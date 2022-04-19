package cloud.folium.internship.serializeanddeserialize;

public class Main {
    public static void main(String[] args) {

        Ship ship = new Ship();
        ship.setModel("Model");
        ship.setCaptain("Meiram");
        ship.setFuel("A-95");

        ShipSerialization shipSerialization = new ShipSerialization(ship);
        shipSerialization.serialize();

//        ShipDeserialization shipDeserialization = new ShipDeserialization();
//        shipDeserialization.deserialize();
    }
}
