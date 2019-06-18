import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
        Visitor visitor;

        @Before
        public void before(){
                visitor = new Visitor(20, 175, 50);
        }

        @Test
        public void checkIfVisitorHasAge(){
                assertEquals(20, visitor.getAge());
        }

        @Test
        public void checkIfVisitorHasHeight(){
                assertEquals(175, visitor.getHeight());
        }

        @Test
        public void checkIfVisitorHasMoney(){
                assertEquals(50, visitor.getMoney());
        }
}

