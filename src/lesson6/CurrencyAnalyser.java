package lesson6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CurrencyAnalyser {

    public static void main(String[] args) {
        System.out.println("Line count = " + countLinesInFile());

        CurrencyRate[] rates = readDataFromFile();

        CurrencyRate highestRate = getHighestRate(rates, "EURUSD");
        System.out.println("Highest Rate: "
                + " date = " + highestRate.getDate()
                + " time = " + highestRate.getTime()
                + " value = " + highestRate.getHigh());
    }

    public static CurrencyRate getHighestRate(CurrencyRate[] rates,
                                               String pair) {
        CurrencyRate rateWithHighestValue = null;
        float highestRate = 0;
        for (int i = 0; i < rates.length; i++) {
            boolean pairValid = rates[i].getPair().equals(pair);
            boolean isHigh = rates[i].getHigh() > highestRate;
            if (isHigh && pairValid) {
                highestRate = rates[i].getHigh();
                rateWithHighestValue = rates[i];
            }
        }
        return rateWithHighestValue;
    }

    private static int countLinesInFile() {
        int lineCount = 0;
        try {
            File f = new File("C:\\work\\projects\\JavaGuruLV\\Java1\\javagurulv_java1_2017_spring_tuesday\\src\\lesson6\\050115.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            System.out.println("Reading file using Buffered Reader");

            System.out.println(b.readLine());

            while ((b.readLine()) != null) {
                lineCount++;
            }
        } catch (IOException e) {}
        return lineCount;
    }

    private static CurrencyRate[] readDataFromFile() {
        int lineCount = countLinesInFile();
        CurrencyRate[] arr = new CurrencyRate[lineCount];
        try {
            File f = new File("C:\\work\\projects\\JavaGuruLV\\Java1\\javagurulv_java1_2017_spring_tuesday\\src\\lesson6\\050115.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            System.out.println("Reading file using Buffered Reader");

            System.out.println(b.readLine());
            int i = 0;
            while ((readLine = b.readLine()) != null) {
                CurrencyRate rate = convert(readLine);
                arr[i] = rate;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }

    public static CurrencyRate convert(String str) {
        String[] elements = str.split(",");
        CurrencyRate currencyRate = new CurrencyRate(
                elements[0],
                elements[1],
                elements[2],
                Float.parseFloat(elements[3]),
                Float.parseFloat(elements[4]),
                Float.parseFloat(elements[5]),
                Float.parseFloat(elements[6])
        );
        return currencyRate;
    }

}
