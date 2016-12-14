package no03;

//다음 자바 코드 실행시 출력되는 결과는?
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
