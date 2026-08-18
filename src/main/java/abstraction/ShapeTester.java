package abstraction;

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3,4);

        rectangle.print();
        System.out.println("Area of rectangle : " + rectangle.calculateArea());

    }
}
