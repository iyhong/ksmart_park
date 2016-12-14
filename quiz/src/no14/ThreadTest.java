package no14;

public class ThreadTest {
	public static void main(String[] args) {
		Test t = new Test();

		MyRunnable mr1 = new MyRunnable(t, 1);
		Thread t1 = new Thread(mr1);	//mr1인스턴스는 t의 참조값, int 1 MyRunnable()생성자 , run()메서드
		t1.start();	//start()메서드를 호출하면 run() 메서드를 호출하여 쓰레드(stack)을 하나 더 세운다.
					//run()으로 스레드를 하나 세우고 execute()메서드를 하

		MyRunnable mr2 = new MyRunnable(t, 2);
		Thread t2 = new Thread(mr2);
		t2.start();
	}

}

class Test {
	int id;

	public  void execute(int val) {	//synchronized 를 빼면
		id = val;	//첫번째 쓰레드가 여기까지 실행하고 그 이후 바로 두번째 쓰레드를 올려 id값을 2로 바꾸면 2222만 출력됨
					//만약  첫번째 스레드가 아래 id를 출력하는 곳까지 실행하고 쉴때 두번째 쓰레드를 올리면 1222만 출력됨
					//결국 1222 하고 2222 두가지만 실행됨.
		System.out.println(id);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		System.out.println(id);
	}
}

class MyRunnable implements Runnable {
	Test t;
	int id;

	MyRunnable(Test t, int id) {
		this.t = t;
		this.id = id;
	}

	@Override
	public void run() {
		t.execute(this.id);
	}
}