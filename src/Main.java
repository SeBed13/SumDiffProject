import java.util.Scanner;

public class Main {
    public static int printAndCalculateEverythingOfTwoNumbers() {
        Scanner no = new Scanner(System.in);
        System.out.println("Please write two numbers:");

        int firstNumber = no.nextInt();
        int secondNumber = no.nextInt();

        System.out.println("Numbers being added up " + firstNumber + " + " + secondNumber + " with the result being " + (firstNumber + secondNumber));

        System.out.println("The difference between " + firstNumber + " - " + secondNumber + " is " + (firstNumber - secondNumber));

        System.out.println("The multiplication between " + firstNumber + " * " + secondNumber + " is " + (firstNumber * secondNumber));

        System.out.println("The division between " + firstNumber + " / " + secondNumber + " is " + (firstNumber / secondNumber));

        return firstNumber;
    }

    public static void main(String[] args) {

printAndCalculateEverythingOfTwoNumbers();
    }
}