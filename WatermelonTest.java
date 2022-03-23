import org.junit.Test;

import static org.junit.Assert.*;

public class WatermelonTest {

    @Test
    public void odd_weight() {
        Watermelon tester = new Watermelon();
        assertEquals("NO",0,tester.watermelon(5));
    }

    @Test
    public void even_weight() {

        Watermelon tester = new Watermelon();
        assertEquals("YES",1,tester.watermelon(8));

    }

    @Test
    public void weight_equal_2kilo() {
        Watermelon tester = new Watermelon();
        assertEquals("NO",0,tester.watermelon(2));
    }

    @Test
    public void weight_larger_than_100kilo() {
        Watermelon tester = new Watermelon();
        assertEquals(-1,tester.watermelon(150));

    }

    @Test
    public void ZERO_weight() {
        Watermelon tester = new Watermelon();
        assertEquals(-1,tester.watermelon(0));    }

}
