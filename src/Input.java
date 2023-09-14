import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        float floatOne;
        double doubleOne;
        //add more variables of at least 2 different types


        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();


        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        System.out.print("Enter Float:");
        floatOne = keyboard.nextFloat();

        System.out.print("Enter double:");
        doubleOne =keyboard.nextFloat();



        //add in input for all variables


        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );
        System.out.println("float =" +floatOne);
        System.out.println("double =" +doubleOne);

        //add output for all variables


    }
}