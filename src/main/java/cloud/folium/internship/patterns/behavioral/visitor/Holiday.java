package cloud.folium.internship.patterns.behavioral.visitor;

public class Holiday implements IVisitor{
    public String place;

    @Override
    public void visit(Zoo zoo) {
        place = "Visited Zoo place...";
    }

    @Override
    public void visit(Cinema cinema) {
        place = "Visited Cinema place...";
    }

    @Override
    public void visit(Circus circus) {
        place = "Visited Circus place...";
    }
}
