package lesson12;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static org.junit.Assert.assertEquals;

public class TestCases {

    public static List<Transaction> getTransactions() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 200),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        return transactions;
    }

    @Test
    public void task1() {
        List<Transaction> transactions = getTransactions();

        Comparator<Transaction> comparator = new Comparator<Transaction>() {
            @Override
            public int compare(Transaction t1,
                               Transaction t2) {
                int value1 = t1.getValue();
                int value2 = t2.getValue();

                if (value1 < value2) {
                    return -1;
                } else if (value1 == value2) {
                    return 0;
                } else {
                    return 1;
                }
            }
        };

        List<Transaction> transactions2011 =
                transactions.stream()
                .filter(t -> t.getYear() == 2011)
                //.sorted((t1, t2) -> new Integer(t1.getValue()).compareTo(t2.getValue()))
                .sorted(Comparator.comparingInt(Transaction::getValue))
                //.sorted(comparator)
                .collect(toList());
        assertEquals(transactions2011.size(), 2);
        assertEquals(transactions2011.get(0).getValue(), 200);
        assertEquals(transactions2011.get(1).getValue(), 300);
    }

    @Test
    public void task2() {
        List<Transaction> transactions = getTransactions();

        Set<String> cities =
                transactions.stream()
                        .map(Transaction::getTrader)
                        .map(Trader::getCity)
                        .collect(toSet());
        assertEquals(cities.size(), 2);
    }

    @Test
    public void task3() {
        List<Transaction> transactions = getTransactions();

        List<Trader> traders =
                transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(trader -> trader.getCity().equals("Cambridge"))
                        .distinct()
                        //.sorted((trader1, trader2) -> trader1.getName().compareTo(trader2.getName()))
                        .sorted(Comparator.comparing(Trader::getName))
                        .collect(toList());
        assertEquals(traders.size(), 3);
        assertEquals(traders.get(0).getName(), "Alan");
        assertEquals(traders.get(1).getName(), "Brian");
        assertEquals(traders.get(2).getName(), "Raoul");
    }

}
