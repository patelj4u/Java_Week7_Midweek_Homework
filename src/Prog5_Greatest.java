//Take two int values from user and print greatest among them.


import java.util.Scanner;

public class Prog5_Greatest {

    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        num1=sc.nextInt();

        System.out.println("Enter number2");
        num2=sc.nextInt();

        if (num1>num2){
            System.out.println("Frist number is greater then the secound number");
        } else if (num2>num1) {
            System.out.println("Second number is greater than the First number");}
         else  {
            System.out.println("Both are equal");


    }


}
}
