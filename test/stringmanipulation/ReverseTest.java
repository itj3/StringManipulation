package stringmanipulation;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static stringmanipulation.Reverse.reverse;

public class ReverseTest {
    private final Reverse rev = new Reverse();

    @Test
    public void reverse_even(){
        assertEquals("neve", reverse("even"));
    }

    @Test
    public void reverse_odd(){
        assertEquals("ddo", reverse("odd"));
    }
}
