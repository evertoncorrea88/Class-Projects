
public class ShapeTester {

    public static void main(String[] args) {
        //Task 1 - Inheritance
        System.out.println("Task 1 - Inheritance");
        Circle c = new Circle("yellow", 2.5);
        Rectangle r = new Rectangle("blue", 3.0, 5.0);
        System.out.println(c);
        System.out.println("Area is " + c.computeArea());
        System.out.println(r);
        System.out.println("Area is " + r.computeArea());

        //Task 2 - Polymorphism
        System.out.println("\nTask 2 - Polymorphism");
        Shape[] list = new Shape[4];
        list[0] = c;
        list[1] = r;
        list[2] = new Circle("red", 5.0);
        list[3] = new Rectangle("black", 10.0, 2.0);

        for (Shape s : list) {
            System.out.println(s);
            System.out.println("Area is " + s.computeArea());
        }
    }
}
