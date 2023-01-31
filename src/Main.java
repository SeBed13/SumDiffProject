public class Main {
public static void printAndCalculateDiffOfTwoNumbers(int primulNumar, int alDoileaNumar) {
    System.out.println("The difference between " + primulNumar + " - " + alDoileaNumar + " is " + (primulNumar-alDoileaNumar));
}
    public static int printAndCalculateSumOfTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println("Numbers being added up " + firstNumber + " + " + secondNumber + " with the result being " + (firstNumber+secondNumber));
        return firstNumber + secondNumber;
    }
    public static void main(String[] args) {
printAndCalculateSumOfTwoNumbers(5, 7);
printAndCalculateSumOfTwoNumbers(10, 112);
printAndCalculateSumOfTwoNumbers(4578, 8947);
printAndCalculateSumOfTwoNumbers(89376, 74893);
printAndCalculateDiffOfTwoNumbers(7, 3);
printAndCalculateDiffOfTwoNumbers(146, 78);
printAndCalculateDiffOfTwoNumbers(64783, 2832);
printAndCalculateDiffOfTwoNumbers(997763, 66378);

int sum = 0;
for (int i = 0; i < 10; i++){
    sum = printAndCalculateSumOfTwoNumbers(i, i + 2);
}
        System.out.println("Sum is: " + sum);
    }
}