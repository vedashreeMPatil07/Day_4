package prac;

import java.util.*;


class Garden{
	
	public void show() {
		
		System.out.println("This is Garden show method");
	}
	
	
	public void display() {
		
		System.out.println("This is the Garden displaying all methods");
	}
}

class Flower extends Garden{
	
	@Override
	public void display() {
		
		System.out.println("The flower is being displayed in a vase");
	}
	
	public void m1() {}
	
	public void m2() {}
	
}


public class L1Neeraj {
	
	
	public static void main(String[] args) {
	
			
		
	}

}
