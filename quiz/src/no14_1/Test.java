package no14_1;

public class Test {
	int id;

	public void execute(int val) {	//synchronized 
		id = val;
		System.out.println(id);
		try {
			Thread.sleep(5000);	//���� �����带 ����ּ��� 5��
		} catch (InterruptedException e) {
		}
		System.out.println(id);
	}

}
