/*Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly*/

import java.util.Scanner;

public class Prog9_Medical {
    public static void main(String[] args) {
        // A student will not be allowed to sit in exam if his/her attendence is less than 75%

        Scanner S = new Scanner(System.in);

        System.out.println("Enter number of class attendend");
        float Ca = S.nextFloat();

        System.out.println("Enter number of class held");
        float Ch = S.nextFloat();

        System.out.println("Did student have any medical cause \"true or false?\"");
        boolean medical = S.nextBoolean();

        if (medical || (Ca/Ch*100 >75)) {
            System.out.println("You are allowed to sit in exam with "+Ca/Ch*100 +" Percentage of attendence");
        }
        else {
            System.out.println("You are not allowed to sit in exam with "+ Ca/Ch*100 + " Percentage of attendance");
        }

    }
}
