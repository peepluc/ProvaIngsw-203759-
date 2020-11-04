package pkg;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
private static MyListUtil util;

	@BeforeClass
	public static void init() {
		util= new MyListUtil();
		System.out.println("INIZIALIZZO MYLISTUTIL");
	}
	
	@Test
	public void riordinaCrescenteWorks() {
		assertEquals(Arrays.asList(1,2,3), util.riordinaCrescente(Arrays.asList(3,2,1)));
		assertEquals(Arrays.asList(5,10,15,20,25,30,35,40), util.riordinaCrescente(Arrays.asList(40,30,35,20,25,10,15,5)));
		assertEquals(Arrays.asList(9,12,15,30,72), util.riordinaCrescente(Arrays.asList(72,9,30,12,15)));
	}
	
	@Test
	public void riordinaDecrescenteWorks() {
		assertEquals(Arrays.asList(3,2,1), util.riordinaDecrescente(Arrays.asList(1,2,3)));
		assertEquals(Arrays.asList(40,35,30,25,20,15,10,5), util.riordinaDecrescente(Arrays.asList(40,30,35,20,25,10,15,5)));
		assertEquals(Arrays.asList(72,30,15,12,9), util.riordinaDecrescente(Arrays.asList(72,9,30,12,15)));
	}
	
	
}
