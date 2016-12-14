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
		
			//ArithmeticException 발생시에만 아래 catch문 실행
		} catch (ArithmeticException e) {
			result += "2";
		
		//나머지 다른 모든 Exception 발생시 아래catch문 실행(ex. classNotFoundException)
		} catch (Exception e) {
			result += "3";
		} finally {
			result += "4";
		}
		result += "5";
	}
}