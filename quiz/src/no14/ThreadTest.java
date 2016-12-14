package no14;

public class ThreadTest {
	public static void main(String[] args) {
		Test t = new Test();

		MyRunnable mr1 = new MyRunnable(t, 1);
		Thread t1 = new Thread(mr1);	//mr1�ν��Ͻ��� t�� ������, int 1 MyRunnable()������ , run()�޼���
		t1.start();	//start()�޼��带 ȣ���ϸ� run() �޼��带 ȣ���Ͽ� ������(stack)�� �ϳ� �� �����.
					//run()���� �����带 �ϳ� ����� execute()�޼��带 ��

		MyRunnable mr2 = new MyRunnable(t, 2);
		Thread t2 = new Thread(mr2);
		t2.start();
	}

}

class Test {
	int id;

	public  void execute(int val) {	//synchronized �� ����
		id = val;	//ù��° �����尡 ������� �����ϰ� �� ���� �ٷ� �ι�° �����带 �÷� id���� 2�� �ٲٸ� 2222�� ��µ�
					//����  ù��° �����尡 �Ʒ� id�� ����ϴ� ������ �����ϰ� ���� �ι�° �����带 �ø��� 1222�� ��µ�
					//�ᱹ 1222 �ϰ� 2222 �ΰ����� �����.
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