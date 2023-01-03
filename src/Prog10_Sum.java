
//Write a program to print the sum of two numbers entered by user by defining your own method.



import java.util.Scanner;

public class Prog10_Sum {

    public static void main(String[] args) {
     int num1,num2;
     int x =0, i=1;
     int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        num1=sc.nextInt();

        System.out.println("Enter second number");
        num2=sc.nextInt();
        while (i<=x){
            sum=num1+num2;
            i++;
        }
        System.out.println("Sum of number is " +sum);



    }
}
