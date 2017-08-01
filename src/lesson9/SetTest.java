package lesson9;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SetTest {

    @Test
    public void addTest() {
        Set<String> words = new HashSet<>();
        assertEquals(words.size(), 0);
        words.add("A");
        assertEquals(words.size(), 1);
    }

    @Test
    public void removeTest() {
        Set<String> words = new HashSet<>();
        words.add("A");
        words.remove("A");
        assertEquals(words.size(), 0);
    }

}
