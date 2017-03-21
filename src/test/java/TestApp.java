import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.vampa.spring.core.App;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by vampa on 21.03.2017.
 */
public class TestApp {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testLogEvent() {
        App.main(null);
        String msg = outContent.toString();

        Assert.assertFalse(msg.contains("Some event for 1"));
        Assert.assertTrue(msg.contains("Some event for John Smith"));
    }
}
