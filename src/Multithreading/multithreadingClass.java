package Multithreading;

public class multithreadingClass extends Thread {
	
	private Integer numberThread ; 
	
	public multithreadingClass(int numberThread ) {
		this.numberThread = numberThread ;
		
	}
	
	@Override
	public void run () {
	for (int  i = 1 ; i<=5 ; i++) {
		System.out.println("'"+i+"'" + " this is the thread number " + numberThread);
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
		
	}

	public static void main(String[] args) {
		
		for (int i = 0 ;  i<= 5 ; i ++) {
			multithreadingClass mything =  new multithreadingClass(i) ;
			mything.start();
		} 
		
	}

}
