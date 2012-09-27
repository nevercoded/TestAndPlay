package sort.test;

import static org.junit.Assert.*;

import javax.swing.text.html.StyleSheet.ListPainter;

import org.junit.Before;
import org.junit.Test;

import sort.CsuShuffle;

public class CsuShuffleTest {

	private String[] list = null;
	
	@Before
	public void setUp() throws Exception {
		list = new String[10];
		for(int i=0;i<10;i++){
			list[i] = "test"+i;
		}
	}

	@Test
	public void testShuffle() {
		CsuShuffle s = new CsuShuffle();
		s.shuffle(list);
		for(int i=0;i<10;i++){
			System.out.println(list[i]);
		}
	}
	

}
