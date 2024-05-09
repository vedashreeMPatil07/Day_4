package innerClasses;

import java.util.Iterator;

/*
 * Goal:- To give implementation to the display method.
 * Normally we need to create a child class and implement this interface so that we can give
 * method body to display.
 * 
 * But instead of creating an entire new class. We can just use anonymous class to give 
 * implementation to display method.
 * 
 * Syntax:-
 * NameOfClass/Interface variable=new NameOfClass/Interface(){};
 * 
 * Point to remember:-
 * Anonymous class behaves like the child class of the interface/class with which we are making it.
 */
interface Inter1{
	
	void display();
	
	
}


public class AnonymousEx1 {

	
	
	public static void main(String[] args) {
		//Below we have created the object of anonymous class and referred it with variable i.
		Inter1 i=new Inter1() {

			@Override
			public void display() {
				
				System.out.println("Display method inside anonymous class object");
			}
			};
			
			i.display();//calling display method from object

	}

}
