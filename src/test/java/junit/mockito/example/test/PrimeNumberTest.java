package junit.mockito.example.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import junit.mockito.example.PrimeNumber;

import org.junit.Before;
import org.junit.Test;

//@RunWith(MockitoJUnitRunner.class)
public class PrimeNumberTest {
    
    PrimeNumber primeNumber;
    
    @Before
    public void setup() {
	primeNumber = new PrimeNumber();
    }
    
    @Test
    public void positiveTest() {
	assertTrue(primeNumber.isPrime(3));
    }
    
    @Test
    //(timeout = 1)
    public void negativeTest() {
	assertFalse(primeNumber.isPrime(6));
    }
    
}
