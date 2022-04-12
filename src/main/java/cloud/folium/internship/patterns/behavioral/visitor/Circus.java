package cloud.folium.internship.patterns.behavioral.visitor;

public class Circus implements IPlace{
    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
}
