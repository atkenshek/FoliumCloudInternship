package cloud.folium.internship.streamapi;

import java.util.List;

public class CompositeModifier implements IModifier{
    private List<Modifier> modifier;


    @Override
    public void updateUser(List<User> users) {
        users.stream().forEach(user -> user.s);
    }
}
