package no10;

public class Inheritance {
	public static void main(String[] args) {
		Sub sub =new Sub("admin",30);
	}
}

class Super1 {
	String name;
	int age;

	Super1() {
	}

	Super1(String str, int val) {
		name = str;
		age = val;
	}
}

class Sub extends Super1 {
	Sub(String str, int val) {
		//�θ�Ŭ������ name������ �ʱ�ȭ�� �Ǿ����� �ʾ�(null������) equals �޼��带 ����Ҽ� ����.
		//NullPointerException �߻���
		
		super(str,val); //�Ǵ� �̷��� �θ�Ŭ������ �����ڸ޼��带 ���� �ʱ�ȭ���ش���
						//if���� ������ ���ܹ߻����� ����...
		
		if (name.equals("")) {
			name = "guest";
		}
		
		//�̷��� null �϶� �����϶�� �ؾ� ���� �����...
		/*if (name == null) {
			name = "guest";
		}*/
		
		 
		if (age < 1 || age > 200) {
			age = 0;
		}
		System.out.println("�̸�:" + name + "/����:" + age);
	}
}