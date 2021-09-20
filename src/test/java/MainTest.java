import org.junit.Test;
import org.junit.jupiter.api.*;

public class MainTest {
    @Test
    public void Test() {
        String actual = Main.GetMessage();
        Assertions.assertEquals("Hello", actual);
    }
}
