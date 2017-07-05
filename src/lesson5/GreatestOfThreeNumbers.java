package lesson5;

public class GreatestOfThreeNumbers {

    public static void main(String[] args) {
        int firstNumber = CommonMethods.getNumberFromUser();
        int secondNumber = CommonMethods.getNumberFromUser();
        int thirdNumber = CommonMethods.getNumberFromUser();
        int maxNumber = CommonMethods.findMaxNumber(firstNumber, secondNumber, thirdNumber);
        CommonMethods.printMessageToConsole("Max Number = " + maxNumber);
    }

}
