
//Take values of length and breadth of a rectangle from user and check if it is square or not.


import java.util.Scanner;

public class Prog4_Values {
    public static void main(String[] args) {
        int a,b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght");
        a=sc.nextInt();

        System.out.println("Enter the Breath");
        b=sc.nextInt();

        if (a==b){
            System.out.println("It is Square");
        }
        else {
            System.out.println("It is not Square");
        }
    }





}
