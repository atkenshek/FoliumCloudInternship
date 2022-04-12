package cloud.folium.internship.patterns.behavioral.state;

public class StartState implements State {

    public void doAction(StateContext context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}