package data_structures;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
    }

    public static void setDemo() {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");


        Set addFruit = Set.of("pear","rasin", "cherry");

        fruits.addAll(addFruit);
        System.out.println(fruits);

        System.out.println("Contains lemons ? "+ fruits.contains("lemon"));

        System.out.println("Size of collection : "+ fruits.size());
    }
}
