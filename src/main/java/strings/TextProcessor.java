package strings;

import java.util.Arrays;

public class TextProcessor {
    public static void main(String[] args) {
//        countWords("I love java");
//        reverseString("Hello World");
        addSpaces("HeyWorld!It'sMeRohan");
    }

    public static void addSpaces(String s) {
        var modifiedText = new StringBuilder(s);
        for(int i=0; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }

    public static void reverseString(String text) {
        String newStr;
        for(int i= text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);
        System.out.println(Arrays.toString(words));

    }
}
