package cloud.folium.internship.patterns.behavioral.command;

public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock abcStock){
        this.stock = abcStock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}