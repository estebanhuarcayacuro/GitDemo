package section17;

public class PS2 extends PS3{

	int a;
	
	//default constructor
	public PS2(int a) {
		super(a); // parent class constructor is invoked
		this.a = a; //this
	}

	public int increment() {
		a = a + 1;
		return a;
	}
	
	public int decrement() {
		a = a - 1;
		return a;
	}
}
