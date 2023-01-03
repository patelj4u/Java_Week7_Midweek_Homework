
//11. Write a program to print a string entered by user.

import java.util.Scanner;

public class Prog11_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.next();   //reads string before the space
        System.out.print("You have entered: "+str);
    }
}
