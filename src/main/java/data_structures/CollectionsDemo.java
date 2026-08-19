package data_structures;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
//        setDemo();
//        listDemo();
        queueDemo();
    }

    private static void queueDemo() {

        Queue fruits = new LinkedList();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println("Queue of fruits : "+ fruits );

        fruits.remove("lemon");
        System.out.println("Fruits after remove : "+ fruits);
        System.out.println("Head of queue :"+ fruits.peek() );

    }

    public static void listDemo() {
        List fruits = new ArrayList();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.set(2, "grapes");
        fruits.add("lemon");
//        fruits.remove("lemon");
        System.out.println("Arraylist of fruits : "+ fruits);
        System.out.println("Item at index 2 is : "+ fruits.get(2));
        System.out.println("Index of orange is : "+ fruits.indexOf("orange"));
        System.out.println("Get last index of Lemon : "+ fruits.lastIndexOf("lemon"));
        List moreFruits = List.of("cherry", "plum"); //Immutable

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
