package innerClasses;
/*
 * Local inner class is created inside a method. Its scope is local, meaning we will not be able to access it from
 * outside the method.
 * So we will have to make its object inside the method itself.
 */
class E{
	
	void display() {
		
		System.out.println("Display method of outer class E");
		
		class F{
			
			void show() {
				
				System.out.println("show method of inner class F");
			}
			
		}//class F ends
	
		new F().show();
		
	}//display method ends
	
}//class E ends
public class LocalInnerEx1 {

	public static void main(String[] args) {
		
		new E().display();

	}

}
