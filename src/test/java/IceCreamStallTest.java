import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    IceCreamStall iceCreamStall;

    @Before

    public void before(){
        iceCreamStall = new IceCreamStall("Super Awesome Ice Creams", "John Smith", 1);
    }

    @Test
    public void checkIfIceCreamStallHasAName(){
        assertEquals("Super Awesome Ice Creams", iceCreamStall.getName());
    }

    @Test
    public void checkIfIceCreamStallHasAOwnerName(){
        assertEquals("John Smith", iceCreamStall.getOwnerName());
    }


    @Test
    public void checkIfIceCreamStallHasAParkingSpot(){
        assertEquals(1, iceCreamStall.getParkingSpot());
    }


}
