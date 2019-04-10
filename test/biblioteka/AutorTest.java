package biblioteka;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutorTest {
	
	private Autor a;

	@Before
	public void setUp() throws Exception {
		a = new Autor();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testSetIme() {
		a.setIme("Pera");
		
		assertEquals("Pera", a.getIme());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImeNull() {
		a.setIme(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImePrazanString() {
		a.setIme("");
	}

	@Test
	public void testSetPrezime() {
		a.setPrezime("Peric");
		
		assertEquals("Peric", a.getPrezime());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrezimeNull() {
		a.setPrezime(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrezimePrazanString() {
		a.setPrezime("");
	}

	@Test
	public void testToString() {
		a.setIme("Zika");
		a.setPrezime("Zikic");
		
		assertEquals("Autor [ime=Zika, prezime=Zikic]", a.toString());
	}

	@Test
	public void testEqualsObjectTRUE() {
		a.setIme("Pera");
		a.setPrezime("Peric");
		
		Autor a2 = new Autor();
		a2.setIme("Pera");
		a2.setPrezime("Peric");
		
		assertTrue( a.equals(a2)  );
	}
	
	@Test
	public void testEqualsObjectFALSE() {
		a.setIme("Pera");
		a.setPrezime("Peric");
		
		Autor a2 = new Autor();
		a2.setIme("Miki");
		a2.setPrezime("Peric");
		
		assertFalse( a.equals(a2)  );
	}
	
	@Test
	public void testEqualsObjectFALSE2() {
		a.setIme("Pera");
		a.setPrezime("Mikic");
		
		Autor a2 = new Autor();
		a2.setIme("Pera");
		a2.setPrezime("Peric");
		
		assertFalse( a.equals(a2)  );
	}
	
	@Test
	public void testEqualsObjectFALSE3() {
		a.setIme("Mika");
		a.setPrezime("Mikic");
	
		Autor a2 = new Autor();
		a2.setIme("Pera");
		a2.setPrezime("Peric");
		
		assertFalse( a.equals(a2)  );
	}

}
