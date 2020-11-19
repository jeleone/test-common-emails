package email.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailTest {
	private static final String[] TEST_EMAILS = { "ab@bc.com", "a.b@c.org", "abcdefghijklmnopqrst@abcdefghijklmnopqrst.com.bd" };
	
	private String[] testValidChars = { " ", "a", "A", "\uc5ec", "0123456789", "01234567890123456789", "\n" };
	
	// Concrete Email Class for testing
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception {
		
	}	
	
	@Test
	public void testAddBcc() throws Exception {
		
		email.addBcc(TEST_EMAILS);
		
		assertEquals(3, email.getBccAddresses().size());
	}
	
	@Test
	public void testAddcc() throws EmailException {
		email.addCc("test@abc.com");
	}
	
	@Test
	public void testHeader() throws Exception {
	
		email.addHeader("Kenny", "97");
	}
	
	@Test
	public void testFrom() throws Exception {
	
		email.setFrom("jeleone@umich.edu");
	}
	
	@Test
	public void testReply() throws Exception {
	
		email.addReplyTo("tenshinhan@chaozu.com", "Crane");
	}
	
	@Test
	public void testHost() throws Exception {
		
		email.getHostName();
	}
	
	@Test
	public void testDate() throws Exception {
		
		email.getSentDate();
	}
	
	@Test
	public void testTimeout() throws Exception {
		
		email.getSocketConnectionTimeout();
	}
}
