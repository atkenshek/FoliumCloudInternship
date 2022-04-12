package cloud.folium.internship.patterns.structural.bridge;

public abstract class ShapeBridge {
    protected IShapeBP iShape;

    protected ShapeBridge(IShapeBP drawShape){
        this.iShape = drawShape;
    }

    protected abstract void drawShape_ShapeBridge();
    protected abstract void fillColor_ShapeBridge();
}