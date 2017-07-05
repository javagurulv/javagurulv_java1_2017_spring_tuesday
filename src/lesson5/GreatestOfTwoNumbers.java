package lesson5;

public class GreatestOfTwoNumbers {

    public static void main(String[] args) {
        int firstNumber = CommonMethods.getNumberFromUser();
        int secondNumber = CommonMethods.getNumberFromUser();
        int maxNumber = CommonMethods.findMaxNumber(firstNumber, secondNumber);
        CommonMethods.printMessageToConsole("Max Number = " + maxNumber);
    }

}
