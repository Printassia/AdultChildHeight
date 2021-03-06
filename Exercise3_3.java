package CH03;

import java.util.Scanner;

/*
One way to estimate the adult height of a child is to use the following formula,
which uses the height of the parents:
Hmale_child = ((Hmother * 13/12) + Hfather) / 2
Hfemale_child = ((Hfather * 12/13) + Hmother) / 2
All heights are in inches. Write a program that takes as input the gender of the
child, the height of the mother in inches, and the height of the father in inches,
and outputs the estimated adult height of the child in inches. The program should
allow the user to enter a new set of values and output the predicted height 
until the user decides to exit. The user should be able to input the heights 
in feet and inches, and the program should output the estimated height of 
the child in feet and inches. Use the int data type to store the heights.
 */

public class Exercise3_3 {
    public static void main(String[] args) {
        String choice;

        do {
            //Create scanner class
            Scanner input = new Scanner(System.in);

            //Ask for the child gender
            System.out.print("Gender: ");
            String gender = input.next();

            //Ask for the mother height in inches
            System.out.print("Mother's Height (in inches): " );
            int motherHeight = input.nextInt();

            //Ask for the father height in inches
            System.out.print("Father's Height (in inches): ");
            int fatherHeight = input.nextInt();

            //Child Adult Height Formula
            //if gender.equalsIgnoreCase is male .. use the male formula
            if (gender.equalsIgnoreCase("Male")){
                int maleChild = ((motherHeight * 13/12) + fatherHeight) / 2;
                System.out.println("Male Child Predicted Adult Height is "
                        + maleChild + " inches.");
            }
            //if gender.equalsIgnoreCase is female.. use the female formula
            else {
                int femaleChild = ((fatherHeight * 12/13) + motherHeight) / 2;
                System.out.println("Female Child Predicted Adult Height is "
                + femaleChild + " inches.");
            }
            System.out.print("Type 'y' to continue or exit to terminate: ");
            choice = input.next();
        }
        //Loop until the user types exit
        while (!choice.equalsIgnoreCase("exit"));
    }
}
