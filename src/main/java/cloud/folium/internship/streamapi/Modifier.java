package cloud.folium.internship.streamapi;

import java.util.List;
import java.util.stream.Stream;
public class Modifier implements IModifier{
    @Override
    public void updateUser(List<User> users) {
       users.stream().forEach(u -> u.setFirstName("Meiram Sopy"));
    }
}
