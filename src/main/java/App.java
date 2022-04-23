//package models;//import rectangle.java.recatangle;
//import java.util.Scanner;
import java.util.Scanner;
import java.awt.*;
import java.io.Console;
import java.util.Scanner;

//
//Scanner in;
//in = new Scanner(System.in);
//String s = in.nextLine();
public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        //For lenght
        System.out.println("Enter the length (or 'height') of your rectangle:");



        Scanner in;
        in = new Scanner(System.in);
        String stringLenght = in.nextLine();

//        String stringLenght = myConsole.readLine();
        int intLenght = Integer.parseInt(stringLenght);
        //for width
        System.out.println("Enter the width of your rectangle:");

        String stringWidth = in.nextLine();
        int intWidth = Integer.parseInt(stringWidth);
        //create an instance of the class rectangle;

        Rectangle rectangle = new Rectangle(intLenght, intWidth);

//         call isSquare() to check if it is also a square
        boolean squareResult = rectangle.isSquare();
        System.out.println("Is your rectangle a square, too?" + squareResult + "!");

    }
}
