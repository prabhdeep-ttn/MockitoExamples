package junit.mockito.example.test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import junit.mockito.example.LdapServer;
import junit.mockito.example.WriteData;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WriteDataTest {

    WriteData writeData;
    
    //    @Mock
    //    LdapServer server;
    
    @Before
    public void setup() {
	writeData = new WriteData();
    }

    @Test
    public void positiveTest() {
	final String username = "user";
	final String password = "pass";
	final String data = "Data To Be Written";
	final LdapServer server = Mockito.mock(LdapServer.class);
	when(server.isAuthorised(username, password)).thenReturn(true);
	writeData.writeDataForCorrectAuthentication(data, username, password, server);
	verify(server).writeData(data);
	//verify(server.isAuthorised(username, password));
	//verifyNoMoreInteractions(server);
    }

    @Test
    public void negativeTest() {
	//assertFalse(writeData.isPrime(6));
    }

}
