package innerClasses;
/*
 * Nested/Inner classes are made inside another class.
 * They can be :-
 * 1) Non-static:
 * 		a) Regular inner class:- made directly in class
 * 		b) Local inner class :- made inside a method
 * 
 * 2) Static inner class:- made with static keyword inside another class.
 */

class A{
	
	void display() {
		
		System.out.println("display method of outer class A");
		
		new B().show();//calling inner class method inside outer class method.
	}
	
	class B{
		
		void show() {
			
			System.out.println("show() method of inner class B");
		}
		
	}// class B ends
	
}//class A ends
public class Example1 {

	public static void main(String[] args) {
		
		
		/*
		 *  A a=new A();
			A.B x=a.new B();
			
			A.b x=new A().new B();
			
		 * Since B is a non static member of class A, so it is associated with the object of outer class A.
		 * Hence we will have to make the object of inner class with the help of the object of outer class.
		 */
		new A().display();
	}

}
