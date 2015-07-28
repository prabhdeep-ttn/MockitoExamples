package junit.mockito.example;

public class PrimeNumber {

    /**
     * Checks whether an integer is prime or not.
     *
     * @param {@link int} number, which is to be checked for being Prime
     * @return {@link boolean}
     */
    public boolean isPrime(final int number) {
	
	try {
	    Thread.sleep(1l);
	    for (int i = 2; i < number; i++) {
		if (number % i == 0)
		    return false;
	    }
	    
	} catch (final InterruptedException e) {
	    e.printStackTrace();
	}
	return true;
	
    }

}
