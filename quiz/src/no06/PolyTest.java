package no06;

//다음 자바 코드를 컴파일시 오류가 발생되는 라인을 모두 적으시오.
public class PolyTest {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		System.out.println("parent :"+parent);
		parent = child;	//자식클래스로 생성한 인스턴스는 부모 클래스로 생성한 인스턴스에 담을수 있따.
		System.out.println("parent :"+parent);
		child = (Child) parent;
		System.out.println("parent :"+parent);
		//parent.subMethod();// <----------------현재 parent는 child로 만들어진 인스턴스를 담고있는데 부모클래스형이어서 부모가 가지지 않은 멤버는 사용할수 없다.
		parent.superMethod();//<---부모에게 상속받은 메서드는 사용가능
		child.superMethod();//<--child는 본래 부모에게 상속받은 메서드도 가능하고 자신이 가진 메서드도 가능하다.
		//System.out.println(parent.a);// <----------------
		System.out.println(parent.b);
		System.out.println(parent.c);
		//System.out.println(parent.x);// <----------------
		//System.out.println(parent.y);// <----------------
		//System.out.println(parent.z);// <----------------
	}
}

class Parent {
	private int a = 1;
	protected int b = 2;
	public int c = 3;

	public void superMethod() {
		System.out.println("superMethod");
	}
}

class Child extends Parent {
	private int x = 4;
	protected int y = 5;
	public int z = 6;

	public void subMethod() {
		System.out.println("subMethod");
	}
}