import org.junit.Test;

import static org.junit.Assert.*;

public class equilibriumTest {

    @Test
    public void test_n_Equal_ZERO() {
        equilibrium tester = new equilibrium();
        int [][] arr = {{4,1,7},{-2,4,-1},{1,-5,-3}};
        assertEquals(-1,tester.equilibrium(0,arr));
    }

    @Test
    public void test_n_Larger_than_100() {

        equilibrium tester = new equilibrium();
        int [][] arr = {{4,1,7},{-2,4,-1},{1,-5,-3}};
        assertEquals(-1,tester.equilibrium(200,arr));
    }

    @Test
    public void test_example_1() {
        equilibrium tester = new equilibrium();
        int [][] arr = {{4,1,7},{-2,4,-1},{1,-5,-3}};
        assertEquals("NO",0,tester.equilibrium(3,arr));
    }

    @Test
    public void test_example_2() {
        equilibrium tester = new equilibrium();
        int [][] arr = {{3,-1,7},{-5,2,-4},{2,-1,-3}};
        assertEquals("YES",1,tester.equilibrium(3,arr));
    }
}
