package innerClasses;
/*
 * In below example we wanted to change the behaviour of walking method, so instead of creating child class of Person
 * we used anonymous class to override the walking method.
 */
class Person{
	
	void walking() {
		
		System.out.println("The person is walking normally!!");
	}
}
public class AnonEx4 {

	public static void main(String[] args) {
		/*
		 * Person p=new Person() {
		 * 
		 * @Override void walking() {
		 * 
		 * System.out.println("The person should walk briskly!!"); } };
		 * 
		 * p.walking();
		 */
		
		new Person() {
			
			@Override
			void walking() {
				System.out.println("The person should walk briskly!!");
				
			}
		}.walking();
	}

}
