package no09;

public class InnerTest {

	public int a = 1;
	public int b = 2;
	public static void main(String[] args){
		InnerTest it = new InnerTest();
		it.outerMethod(10);
	}
	
	public void outerMethod(final int c) {
		int d = 3;
		
		class Inner {
			void innerMethod(int e) {
				/* 이 블럭에서 참조할 수 있는 변수는? */
				//내부클래스의 스코프는 모두 접근가능
				
				/*.내부클래스의 장점
				- 내부클래스에서 외부클래스의 멤버들을 쉽게 접근할 수 있다. 
				- 코드의 복잡성을 줄일 수 있다.(캡슐화) */
				System.out.println("Inner.innerMethod_a : "+a);
				System.out.println("Inner.innerMethod_b : "+b);
				System.out.println("Inner.innerMethod_c : "+c);
				System.out.println("Inner.innerMethod_d : "+d);
				System.out.println("Inner.innerMethod_e : "+e);
			}
		}
		//메서드내의 클래스 인스턴스화!(클래스 아래에 적어줘야함.. 위에적으면 클래스 있는지 인식못함)
		Inner in = new Inner();
		in.innerMethod(7);
	}
}
