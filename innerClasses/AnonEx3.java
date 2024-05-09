package innerClasses;

abstract class AB{
	
	abstract void m1();
	abstract void m2();
}
public class AnonEx3 {

	public static void main(String[] args) {
		
		AB x=new AB() {

			@Override
			void m1() {
				
				System.out.println("m1() method of anonymous class");
				
			}

			@Override
			void m2() {
				
				System.out.println("m2() method of anonymous class");
				
			}
			
		};
		
		x.m1();
		x.m2();

	}

}
