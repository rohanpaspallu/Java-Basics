package inheritance;

public class InheritanceTester {
    public static void main(String[] args) {
//        Person person1 = new Person();
//        Employee employee1 = new Employee();

        Square square = new Square();
        square.setLength(4);
        System.out.println(square.calculatePerimeter());
    }
}
