import java.util.Scanner;
class scanner
{
    public static void main(String[] args)
    {

        // Creating Scanner class object
        Scanner scn = new Scanner(System.in);

        // Enter first input
        System.out.print("Enter First Number: ");
        int a = scn.nextInt();

        System.out.print("Enter Second Number: ");
        int b = scn.nextInt();

        System.out.println("Sum: " + (a + b));

        // Closing the scanner to release resources
        scn.close();
    }
}



