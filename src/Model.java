import java.awt.*;

public class Model {

    private String type;
    private int price;
    private Color color;
   

    public Model(String type, int price) {
        this.type = type;
        this.price = price;
        this.color = color;
        
    }

    public Model() {

    }


    public String getModel() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Models{" +
                "model=" + type +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}