package code_wars.eight_kyu.test;
import code_wars.eight_kyu.Greetings;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingsTest {
    @Test
    public void testSomething() {
        assertEquals("Hello, Ryan how are you doing today?", Greetings.greet("Ryan"));
    }
}
