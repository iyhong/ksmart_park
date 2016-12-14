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
		//부모클래스의 name변수가 초기화가 되어있지 않아(null상태임) equals 메서드를 사용할수 없다.
		//NullPointerException 발생됨
		
		super(str,val); //또는 이렇게 부모클래스의 생성자메서드를 통해 초기화해준다음
						//if문을 만나면 예외발생하지 않음...
		
		if (name.equals("")) {
			name = "guest";
		}
		
		//이렇게 null 일때 복사하라고 해야 정상 실행됨...
		/*if (name == null) {
			name = "guest";
		}*/
		
		 
		if (age < 1 || age > 200) {
			age = 0;
		}
		System.out.println("이름:" + name + "/나이:" + age);
	}
}