package section17;

import org.testng.annotations.Test;

public class PS1 extends PS {

	@Test
	public void testRun() {
		
		PS2 ps2 = new PS2(3); // Parameterized constructor
		int a = 3;
		doThis(); // parent class
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		PS3 ps3 = new PS3(3);
		System.out.println(ps2.multiplyThree());
	}

}
