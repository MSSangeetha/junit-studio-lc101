package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest()
    {assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void reversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void stringWithBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Sangeetha"));
    }

    @Test
    public void stringOnlyWithoutBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Sangeetha"));
    }

    @Test
    public void stringWithOnlyOneBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Sange[etha"));
    }

    @Test
    public void stringWithReplacedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("San]ge[etha"));
    }
}
