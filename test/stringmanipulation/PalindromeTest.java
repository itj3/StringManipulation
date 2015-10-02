package stringmanipulation;

import org.junit.Test;

import static org.junit.Assert.*;
import static stringmanipulation.Palindrome.isPalindrome;

public class PalindromeTest {

    @Test
    public void notPalindrome_even() {
        assertEquals(false, isPalindrome("nope"));
    }

    @Test
    public void notPalindrome_odd() {
        assertEquals(false, isPalindrome("nopee"));
    }

    @Test
    public void isPalindrome_even() {
        assertEquals(true, isPalindrome("abba"));
    }

    @Test
    public void isPalindrome_odd() {
        assertEquals(true, isPalindrome("abcba"));
    }
}
