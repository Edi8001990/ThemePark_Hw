import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void before(){
        playground = new Playground("Playground for small trouble-makers");
    }

    @Test

    public void checkIfPlaygroundHasAName(){
        assertEquals("Playground for small trouble-makers", playground.getName());
    }
}
