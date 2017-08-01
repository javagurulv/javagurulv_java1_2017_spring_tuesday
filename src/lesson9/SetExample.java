package lesson9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> words = new HashSet<>();

        words.add("a");
        words.add("a");
        words.add("a");
        words.add("a");

        System.out.println("Size = " + words.size());

        words.add("b");
        System.out.println("Size = " + words.size());

        for (String s : words) {
            System.out.println(s);
        }

        List<String> strs = new ArrayList<>();
        for (String s : strs) {
            System.out.println(s);
        }

        for (int i = 0; i < strs.size(); i++) {
            String s = strs.get(i);
            System.out.println(s);
        }


    }


}
