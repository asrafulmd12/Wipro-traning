package multi_Threading;

public class MyThread extends Thread {
	
	public void run()
	{
		for(int i=0;i<2;i++)
		System.out.println(Thread.currentThread().getName());
	}
 
	public static void main(String[] args) throws InterruptedException {
				
		MyThread t0=new MyThread();// new state
		t0.start();
		t0.sleep(6000);
		MyThread t1=new MyThread();
		t1.start();
		System.out.println("current Priority for t1="+t1.getPriority());
		t1.setPriority(7);
		System.out.println("after set Priority for t1="+t1.getPriority());
		MyThread t2=new MyThread();
		t2.start();
		System.out.println("T2 name="+t2.getName());
		t2.setName("Max");
		System.out.println("T2 name="+t2.getName());
        
	}
 
}
 
