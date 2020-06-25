package org.fullstack;

public class App {
	public static int counter = 0 ;
	

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				for(int i=1; i <1000;i++) {
					App.counter++;
				}
				System.out.println("the loops in thead 1 is over: ");
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
		
				for(int i=1; i <1000;i++) {
					App.counter++;
				}
				System.out.println("the loops in thead 2 is over: ");
			}
		});
		
		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		System.out.println("the value of counter: " + App.counter);

	}

}
