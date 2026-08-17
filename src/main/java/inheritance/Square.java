package inheritance;

import objects.Rectangle;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter(){
        return sides*length;

    }

    public void print (String statement){
        System.out.println("I am a : "+ statement);
    }
}
