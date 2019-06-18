import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPark {
    Park park;

    @Before
    public void before(){
        park = new Park("Green valley");
    }

    @Test

    public void checkIfParkHasAName(){
        assertEquals("Green valley", park.getName());
    }

}
