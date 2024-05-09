package innerClasses;
/*
 * static inner class is a class that is made inside another class and made static by using static keyword.
 */
class OuterEx1{
	
	static int a=20;
	int b=12;
	
	static class InnerEx1{
		
		void show() {
			
			System.out.println("Show method of inner class T");
		}
	}
	
	static void display() {
		System.out.println("Inside display method of Outer class");
		new InnerEx1().show();
	}
}
public class StaticInnerEx1 {

	public static void main(String[] args) {
		
		System.out.println(OuterEx1.a);//static members can be called directly using class name.
		System.out.println(new OuterEx1().b);
		/*
		 * Since static inner class acts as a static member of outer class, it will not be associated with the object
		 * of the outer class.
		 * We can make object of inner class without making object of outer class. As seen below.
		 * 
		 * OuterEx1.InnerEx1 x=new OuterEx1.InnerEx1();//creating the object of static inner class
			x.show();
		 */
		
		OuterEx1.display();
	}

}
