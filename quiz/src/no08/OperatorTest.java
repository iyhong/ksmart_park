package no08;

public class OperatorTest {
	private static int result = 0;
	private static boolean flag = false;
	
	
	public static void main(String[] args) {
		setResult(10);
		display();
	}

	public static void setResult(int x) {
		flag = method1(x) || method2();	//���������߿� or [||] �����ڴ� �տ� ���� true�̸� �ڿ��� ������ ����
										//������ ������ true �̴ϱ�...
	}
	public static boolean method1(int x) {
		System.out.println("method1 ����");
		boolean temp = false;
		if (x > 0) {
			result = x;
			temp = false;
		}
		return temp;
	}

	public static boolean method2() {
		System.out.println("method2 ����");
		result = result * 10;
		return true;
	}

	public static void display() {
		System.out.print(result + " ");
		System.out.println(flag);
	}
}
