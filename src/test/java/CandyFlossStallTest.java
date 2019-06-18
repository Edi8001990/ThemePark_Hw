import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before

    public void before(){
        candyFlossStall = new CandyFlossStall("Super Awesome Candies", "Matt Kowalski", 2);
    }

    @Test
    public void checkIfIceCreamStallHasAName(){
        assertEquals("Super Awesome Candies", candyFlossStall.getName());
    }

    @Test
    public void checkIfIceCreamStallHasAOwnerName(){
        assertEquals("Matt Kowalski", candyFlossStall.getOwnerName());
    }


    @Test
    public void checkIfIceCreamStallHasAParkingSpot(){
        assertEquals(2, candyFlossStall.getParkingSpot());
    }


}


