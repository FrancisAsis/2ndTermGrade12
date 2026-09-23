import java.util.Scanner;

public class MyCalculator {
        
    // add two numbers. paramtters: a, b Return type: double 

    public static double add(double a, double b) {
        double sum = a + b;
        return sum;

    }

    public static double subtract(double a, double b) {
        double difference = a - b;
        return difference;

    }

    public static double product(double a, double b) {
        double product = a * b;
        return product;
    }

    public static double quotient(double a, double b) {
        double quotiend = a / b;
        return quotiend;
    }

    public static double remainder(double a, double b) {
        double remainder = a % b;
        return remainder;
    }

    // BONUS Average

    public static double average(double a, double b) {
        double sum = (a + b) / 2;
        return sum;

    }

    // BONUS Max T F

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // BONUS Square

    public static double square(double a) {
        double square = a * a;
        return square;
    }

    // Step 2: write your subtract, multiply, devide, and modolus method here

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println(" === MY CALCULATOR === ");
        System.out.println("[1] add");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multpilication");
        System.out.println("[4] Devision");
        System.out.println("[5] Modulus");
        System.out.println("[6] Average");
        System.out.println("[7] Max");
        System.out.println("[8] Square");
    // Step 3  add menu lines add [2] to [5] here
        System.out.print("Choose an operation: ");
        int choice = input.nextInt();

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = input.nextDouble();

        if (choice == 1 ) {
            double result = add(num1, num2);    // num1 and num 2 are ARGUMENT
            System.out.println("Result: " + result);

        } else if (choice == 2) {
            double result = subtract(num1, num2);
            System.out.println("Result: " + result);

        } else if (choice == 3) { 
            double result = product(num1, num2);
            System.out.println("Result: " + result);

        } else if (choice == 4) {
            if (num2 == 0) {
                System.out.println("Error: Cannot devide by zero");
            } else {
            double result = quotient(num1, num2);
            System.out.println("Result " + result);
        }

        } else if (choice  == 5) {
            double result = remainder(num1, num2);
            System.out.println("Result " + result);

        } else if (choice == 6) { // BONUS Avarage 
            double result = average(num1, num2);
            System.out.println("Result " + result);

        } else if (choice == 7) { // BONUS Max
            double result = max(num1, num2);
            System.out.println("Result " + result);

        } else if (choice == 8) { // BONUS Square
            double result = square(num1);
            System.out.println("Result " + result);

        } else {
            System.out.println("Invalid choice.");
        }

        // Step 3: add else if blocks fro choice 2 to 5 here

        input.close();
    }


}