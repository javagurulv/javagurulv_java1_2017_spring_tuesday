package lesson6;

public class CurrencyAnalyserTest {

    public static void main(String[] args) {
        testConvert();
        testHighestRate();
    }

    private static void testHighestRate() {
        CurrencyRate[] rates = {
                CurrencyAnalyser.convert("CADJPY,20150106,000001,101.41,101.41,101.39,101.39"),
                CurrencyAnalyser.convert("CADJPY,20150106,000002,101.41,101.47,101.39,101.39"),
                CurrencyAnalyser.convert("CADJPY,20150106,000003,101.41,101.40,101.39,101.39"),
        };

        CurrencyRate highestRate = CurrencyAnalyser.getHighestRate(rates, "CADJPY");
        if (highestRate.getTime().equals("000002")) {
            System.out.println("Highest Rate = OK");
        } else {
            System.out.println("Highest Rate = FAIL");
        }
    }

    private static void testConvert() {
        String line = "CADJPY,20150106,000000,101.41,101.41,101.39,101.39";
        CurrencyRate rate = CurrencyAnalyser.convert(line);
        if (rate.getPair().equals("CADJPY")) {
            System.out.println("Pair = OK");
        } else {
            System.out.println("Pair = FAIL");
        }
        if (rate.getDate().equals("20150107")) {
            System.out.println("Date = OK");
        } else {
            System.out.println("Date = FAIL");
            System.out.println("Expect = 20150107");
            System.out.println("But found = " + rate.getDate());
        }
    }

}
