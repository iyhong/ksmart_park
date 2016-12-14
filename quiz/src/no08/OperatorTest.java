package no08;

public class OperatorTest {
	private static int result = 0;
	private static boolean flag = false;
	
	
	public static void main(String[] args) {
		setResult(10);
		display();
	}

	public static void setResult(int x) {
		flag = method1(x) || method2();	//논리연산자중에 or [||] 연산자는 앞에 값이 true이면 뒤에는 보지도 않음
										//어차피 무조건 true 이니깐...
	}
	public static boolean method1(int x) {
		System.out.println("method1 실행");
		boolean temp = false;
		if (x > 0) {
			result = x;
			temp = false;
		}
		return temp;
	}

	public static boolean method2() {
		System.out.println("method2 실행");
		result = result * 10;
		return true;
	}

	public static void display() {
		System.out.print(result + " ");
		System.out.println(flag);
	}
}
