package innerClasses;

interface Inter2{
	
	void display();
	
	 void show();
}
/*
 * Here we already have a class but we do not want to implement the interface.
 * So in order to give implementation to display and show method we have simply used anonymous
 * class.
 * 
 * Clearly we can see that anonymous class can be made in any method.
 */
class AnonDemo2 {
	
	void m() {
		
		Inter2 i=new Inter2() {

			@Override
			public void display() {
				
				System.out.println("Display method in anonymous class !!!");
				
			}

			@Override
			public void show() {
				
				System.out.println("Show method inside anonymous class");
				
			}
			
			};//anonymous class ends
			
			i.display();
			i.show();
	}
	
}
public class AnonEx2 {

	public static void main(String[] args) {
		
		new AnonDemo2().m();

	}

}
