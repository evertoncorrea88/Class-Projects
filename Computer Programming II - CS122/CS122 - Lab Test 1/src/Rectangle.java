
/**
 *
 * @author Everton
 */
public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double computeArea() {
        return length * width;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nLength: " + length;
        result += "\nWidth: " + width;
        return result;
    }

}
