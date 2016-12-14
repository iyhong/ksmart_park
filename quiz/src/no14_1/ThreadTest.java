package no14_1;

public class ThreadTest {
	public static void main(String[] args) {
		  Test t=new Test();
		  
		  MyRunnable mr1=new MyRunnable(t,1);
		  Thread t1=new Thread(mr1);
		  t1.start();
		  
		  MyRunnable mr2=new MyRunnable(t,2);
		  Thread t2=new Thread(mr2);
		  t2.start();
		 } 


}
