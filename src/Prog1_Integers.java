
//Take 10 integers from keyboard using loop and print their average value on the screen.



import java.util.Scanner;

public class Prog1_Integers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        {

            int sum = 0;

            for (int i = 0; i < 10; i++) {

                System.out.print("Enter a number: ");

                sum = sum + sc.nextInt();
            }
            double average = sum / 10;

            System.out.println("Average is " + average);


        }
    }
}
