
//Print multiplication table of 24, 50 and 29 using loop.


import java.util.Scanner;

public class Prog2_Multiplication {

    public static void main(String[] args) {
        int tableNumber = 24;

        System.out.println("Generating the table 10");
        // generating table 24
        for (int i = 1; i <= 10; i++) {

            System.out.format("%d * %d = %d \n", tableNumber, i, tableNumber * i);

        }

        // generating the 50 table.
        System.out.println("\nGenerating the table 20");
        int anotherTableNumber = 50;
        for (int i = 1; i <= 10; i++) {

            System.out.format("%d * %d = %d \n", anotherTableNumber, i, anotherTableNumber * i);

        }
        // generating the 29 table.
        System.out.println("\nGenerating the table 20");
        int anotherTableNumber1 = 29;
        for (int i = 1; i <= 10; i++) {

            System.out.format("%d * %d = %d \n", anotherTableNumber1, i, anotherTableNumber1 * i);


        }
    }
}

