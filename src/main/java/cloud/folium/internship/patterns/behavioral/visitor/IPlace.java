package cloud.folium.internship.patterns.behavioral.visitor;

public interface IPlace {
    void accept(IVisitor v);

}