import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WordReverser {
    // Method to reverse a given word
    public String reverseWord(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Input word cannot be null");
        }
        return new StringBuilder(word).reverse().toString();
    }
}

public class WordReverserTest {

    // Create an instance of the class to be tested
    private final WordReverser reverser = new WordReverser();

    @Test
    void testReverseWordValidInput() {
        String word = "hello";
        String expected = "olleh";
        String result = reverser.reverseWord(word);
        assertEquals(expected, result, "The reversed word should be 'olleh'");
    }

    @Test
    void testReverseWordEmptyString() {
        String word = "";
        String expected = "";
        String result = reverser.reverseWord(word);
        assertEquals(expected, result, "The reversed word of an empty string should be an empty string");
    }

    @Test
    void testReverseWordSingleCharacter() {
        String word = "a";
        String expected = "a";
        String result = reverser.reverseWord(word);
        assertEquals(expected, result, "The reversed word of a single character should be itself");
    }

    @Test
    void testReverseWordWithSpaces() {
        String word = "hello world";
        String expected = "dlrow olleh";
        String result = reverser.reverseWord(word);
        assertEquals(expected, result, "The reversed word should handle spaces correctly");
    }

    @Test
    void testReverseWordWithNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> reverser.reverseWord(null));
        assertEquals("Input word cannot be null", exception.getMessage(), "The method should throw an exception for null input");
    }
}

