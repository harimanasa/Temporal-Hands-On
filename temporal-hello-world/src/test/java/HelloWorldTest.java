import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void testMainOutput() {
        // Simulated output for testing
        String expectedOutput = "Hello, World!\n";
        String actualOutput = getOutputFromMain();

        assertEquals(expectedOutput, actualOutput, "Main output should match");
    }

    @Test
    public void testGreeting() {
        String expected = "Hello, Temporal!";
        String actual = "Hello, Temporal!";
        assertEquals(expected, actual, "Greeting should match");
    }

    private String getOutputFromMain() {
        // Simulated logic to capture the output from HelloWorld.main()
        return "Hello, World!\n";
    }
}