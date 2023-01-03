
//Take input of age of 3 people by user and determine oldest and youngest among them.


import java.util.Scanner;

public class Prog7_Age {

    public static void main(String[] args) {

        // welcome the user
        System.out.println("I can tell you out of the 3 people's ages you enter who is younger and who is older.");
        // get ready to read the user data
        Scanner keyboard = new Scanner(System.in);
        // prompt the user for a letter
        // store the user input
        System.out.print("Please enter a number to represent the first person's age: ");
        int num1 = keyboard.nextInt();
        System.out.print("Please enter a number to represent the second person's age: ");
        int num2 = keyboard.nextInt();
        System.out.print("Please enter a number to represent the third person's age: ");
        int num3 = keyboard.nextInt();
        //declare maxAnswer and minAnswer
        int maxAnswer = 0;
        int minAnswer = 0;

        if (num1 > num2 && num1 > num3) { maxAnswer = num1; }
        if (num2 > num1 && num2 > num3) { maxAnswer = num2; }
        if (num3 > num1 && num3 > num2) { maxAnswer = num3; }

        if (num1 < num2 && num1 < num3) { minAnswer = num1; }
        if (num2 < num1 && num2 < num3) { minAnswer = num2; }
        if (num3 < num2 && num3 < num1) { minAnswer = num3; }

        //output the answer
        System.out.println("The youngest person's age is " + minAnswer + " and the oldest one is " + maxAnswer + " years old.");






    }//main END
}//class END

