package junit.mockito.example;

public class LdapServer {
    
    /**
     * Checks if provided Username and Password combination is correct or not.
     *
     * @param {@link String} username
     * @param {@link String} password
     * @return {@link boolean}
     */
    public boolean isAuthorised(final String username, final String password) {
	// Some Logic To Check Authentication
	return false;
    }

    /**
     * Writes Given Data in Database.
     */
    public void writeData(final String data) {
	// Some Code to Write the Data
    }
}
