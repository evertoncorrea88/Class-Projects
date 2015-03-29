
/**
 *
 * @author Everton
 */
public abstract class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color: " + color;
    }

    public abstract double computeArea();
}
