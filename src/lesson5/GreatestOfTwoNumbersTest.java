package lesson5;

public class GreatestOfTwoNumbersTest {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test1() {
        int maxNumber = CommonMethods.findMaxNumber(1, 2);
        boolean isOk = maxNumber == 2;
        checkResult("TEST 1", isOk);
    }

    private static void test2() {
        int maxNumber = CommonMethods.findMaxNumber(2, 1);
        checkResult("TEST 2", maxNumber == 2);
    }

    private static void test3() {
        int maxNumber = CommonMethods.findMaxNumber(2, 2);
        checkResult("TEST 3", maxNumber == 2);
    }

    private static void checkResult(String testName, boolean result) {
        if (result) {
            CommonMethods.printMessageToConsole(testName + " = OK");
        } else {
            CommonMethods.printMessageToConsole(testName + " = FAIL");
        }
    }

}
