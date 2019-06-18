import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before

    public void before(){
        tobaccoStall = new TobaccoStall("Super Awesome Tobacs", "Alex Walter", 3);
    }

    @Test
    public void checkIfIceCreamStallHasAName(){
        assertEquals("Super Awesome Tobacs", tobaccoStall.getName());
    }

    @Test
    public void checkIfIceCreamStallHasAOwnerName(){
        assertEquals("Alex Walter", tobaccoStall.getOwnerName());
    }


    @Test
    public void checkIfIceCreamStallHasAParkingSpot(){
        assertEquals(3, tobaccoStall.getParkingSpot());
    }


}
