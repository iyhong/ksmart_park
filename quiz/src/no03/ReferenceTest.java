package no03;

//���� �ڹ� �ڵ� ����� ��µǴ� �����?
public class ReferenceTest {
	public static void main(String[] args) {
		ReferenceTest t = new ReferenceTest();
		int a = 20;
		int b[] = { 100, 200, 300 };
		t.change(a, b);
		t.display(a, b);
	}

	void change(int a, int b[]) {
		a += 10;
		b[1] += 10;
	}

	void display(int a, int b[]) {
		System.out.print(a + "/" + b[1]);
	}
}
