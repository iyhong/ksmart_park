package no12;

public class ExceptionTest {
	static String result = "1";

	public static void main(String[] args) {
		
		method(9);
		System.out.println(result);
	}

	public static void method(int x) {
		
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			x /= x;
		
			//ArithmeticException �߻��ÿ��� �Ʒ� catch�� ����
		} catch (ArithmeticException e) {
			result += "2";
		
		//������ �ٸ� ��� Exception �߻��� �Ʒ�catch�� ����(ex. classNotFoundException)
		} catch (Exception e) {
			result += "3";
		} finally {
			result += "4";
		}
		result += "5";
	}
}