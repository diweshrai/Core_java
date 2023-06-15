package a;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Child hi = new Child();
	hi.m1();   // here we get the value using inheritance
	
	
		
	}

public void m1() {
System.out.println("Hi how are you");		
	}
		
}


class Child extends Overriding{    // Done the inheritance
	
	public void m1() {
		System.out.println("I am fine");		// here we done the overriding
			}
	
	
}




// Output is "I am fine"
