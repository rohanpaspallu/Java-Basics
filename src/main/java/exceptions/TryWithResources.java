package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {
        File inputFile = new File("files/numbers.txt");
        File outputFile = new File("file/output.txt");
        try(Scanner fileReader = new Scanner(file); PrintWriter fileWriter = new PrintWriter(outputFile)){
            while (fileReader.hasNext()){
                fileWriter.println(fileReader.nextDouble());
//                System.out.println(fileReader.nextDouble());
            }
        }

        catch (FileNotFoundException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
//        catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }
        catch(Exception e){
            System.out.println("Parent exception : "+ e.getMessage());
        }

    }
}
