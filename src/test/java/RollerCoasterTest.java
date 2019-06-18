import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {
    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Extreme Roll");
    }

    @Test
    public void checkIfRollercoasterHasAName(){
        assertEquals("Extreme Roll", rollercoaster.getName());
    }
}
