package junit.mockito.example;

public class WriteData {

    /**
     * Writes given data for valid user Authentication.
     *
     * @param {@link String} data
     * @param {@link String} username
     * @param {@link String} password
     * @return {@link boolean}
     */
    public void writeDataForCorrectAuthentication(final String data, final String username, final String password,
	    final LdapServer server) {
	if (server.isAuthorised(username, password)) {
	    server.writeData(data);
	}
    }
    
}
