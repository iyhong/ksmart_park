package no13;

public class StringTest {
	public static void main(String[] args) {
		StringBuffer stringbuffer = new StringBuffer("Stringbuffer");
		StringBuffer test = new StringBuffer("Test");
		method(stringbuffer, test);
		System.out.print(stringbuffer);
		System.out.println(test);
		String str = new String("string!!");
		/*String �� �Ϲݺ���ó�� �������� �ѱ�°� �ƴ϶� */
		method1(str);
		System.out.println(str);
	}

	static void method(StringBuffer sb1, StringBuffer sb2) {
		sb1.append(sb2);
		sb2 = sb1;
	}
	static void method1(String str){
		str += "add!!";
	}
}