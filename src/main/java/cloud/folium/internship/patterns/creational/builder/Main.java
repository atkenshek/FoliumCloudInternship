package cloud.folium.internship.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        SmartPhone iPhone = new SmartPhone.SmartPhoneBuilder("iPhone", "13 Pro Max").setColor("Black").build();
        SmartPhone samsung = new SmartPhone.SmartPhoneBuilder("Samsung", "S20 Galaxy").build();

        System.out.println(iPhone.getName() + iPhone.getModelName() + " " + iPhone.getColor());
        System.out.println(samsung.getName() + " " + samsung.getModelName());






    }
}
