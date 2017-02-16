package labWork_2_10_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // lab 2_10_3
        Shape rectangle = Shape.parseShape("Rectangle:RED:10,20");
        Shape triangle = Shape.parseShape("Triangle:GREEN:9,7,12");
        Shape circle = Shape.parseShape("Circle:BLACK:10");

        rectangle.draw();
        triangle.draw();
        circle.draw();

        //lab 2_10_5
        System.out.println("*************************************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size -> :");
        int size = Integer.parseInt(scanner.next());
        Shape[] shapes = new Shape[size];
        for ( int i = 0; i<shapes.length; i++){
            System.out.print("Enter shape "+(i+1) + " -> :");
            shapes[i] = Shape.parseShape(scanner.next());
        }

        System.out.println("Result :");
        for (Shape elem : shapes){
            elem.draw();
        }




    }

}
