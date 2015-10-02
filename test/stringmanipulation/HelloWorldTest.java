package stringmanipulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void printsHelloWorld(){
        assertEquals("Hello, World!", HelloWorld.helloWorld());
    }
}
