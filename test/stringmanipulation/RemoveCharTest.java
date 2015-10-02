package stringmanipulation;

import org.junit.Test;

import static org.junit.Assert.*;
import static stringmanipulation.RemoveChar.removeChar;

public class RemoveCharTest {
    @Test
    public void removeCharTest(){
        assertEquals("heo", removeChar("hello", "l"));
    }
}