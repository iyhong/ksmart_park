package no14_1;

public class MyRunnable implements Runnable {
	Test t;
	int id;

	MyRunnable(Test t, int id) {
		this.t = t;
		this.id = id;
	}

	@Override
	public void run() {
		t.execute(id);

	}

}
