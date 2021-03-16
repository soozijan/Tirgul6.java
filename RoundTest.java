package TirgulPackage;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoundTest {
    @Test
    public void testRoundUpNegativeNum() {
        int actual_result = RoundZero.roundUp(-0.5);
        assertEquals(-1,actual_result);
    }
    @Test
    public void testRoundUpZero() {
        int actual_result = RoundZero.roundUp(0);
        assertEquals(0,actual_result);
    }

    @Test
    public void testroundUpPozitiv()   {
        int actual_result = RoundZero.roundUp(0.2);
        assertEquals(1,actual_result);
    }

    @Test
    public void testroundUpOne()   {
        int actual_result = RoundZero.roundUp(1);
        assertEquals(1,actual_result);
    }

    @Test
    public void testroundUpPlusOne()   {
        int actual_result = RoundZero.roundUp(1.2);
        assertEquals(-1,actual_result);
    }

    @Test
    public void testRoundDownNegativeNum() {
        int actual_result = RoundZero.roundDown(-0.5);
        assertEquals(-1,actual_result);
    }
    @Test
    public void testRoundDownZero() {
        int actual_result = RoundZero.roundDown(0);
        assertEquals(0, actual_result);
    }
    @Test
    public void testRoundDownOne() {
        int actual_result = RoundZero.roundDown(1);
        assertEquals(1, actual_result);
    }
    @Test
    public void testRoundDownPozitiv() {
        int actual_result = RoundZero.roundDown(0.4);
        assertEquals(0, actual_result);
    }
    @Test
    public void testroundDownPlusOne() {
        int actual_result = RoundZero.roundDown(1.2);
        assertEquals(-1, actual_result);
    }

    @Test
    public void testRoundNegativeNum() {
        int actual_result = RoundZero.round(-0.5);
        assertEquals(-1, actual_result);
    }
    @Test
    public void testRoundZero() {
        int actual_result = RoundZero.round(0);
        assertEquals(0, actual_result);
    }
    @Test
    public void testroundPozitiv1() {
        int actual_result = RoundZero.round(0.5);
        assertEquals(1, actual_result);
    }
    public void testroundPozitiv2() {
        int actual_result = RoundZero.round(0.7);
        assertEquals(1, actual_result);
    }

    @Test
        public void testRoundOne()   {
            int actual_result = RoundZero.round(1);
            assertEquals(1, actual_result);
        }
        @Test
        public void testroundPlusOne() {
            int actual_result = RoundZero.round(1.2);
            assertEquals(-1, actual_result);
        }












}
