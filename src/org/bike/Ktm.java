package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("Cost is 100000");
		
	}

	@Override
	public void speed() {
		System.out.println("Speed is 150");
		
	}
	public static void main(String[] args) {
		Ktm bk1=new Ktm();
		bk1.cost();
		bk1.speed();
	}
	

}
