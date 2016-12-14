package no06;

//���� �ڹ� �ڵ带 �����Ͻ� ������ �߻��Ǵ� ������ ��� �����ÿ�.
public class PolyTest {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		System.out.println("parent :"+parent);
		parent = child;	//�ڽ�Ŭ������ ������ �ν��Ͻ��� �θ� Ŭ������ ������ �ν��Ͻ��� ������ �ֵ�.
		System.out.println("parent :"+parent);
		child = (Child) parent;
		System.out.println("parent :"+parent);
		//parent.subMethod();// <----------------���� parent�� child�� ������� �ν��Ͻ��� ����ִµ� �θ�Ŭ�������̾ �θ� ������ ���� ����� ����Ҽ� ����.
		parent.superMethod();//<---�θ𿡰� ��ӹ��� �޼���� ��밡��
		child.superMethod();//<--child�� ���� �θ𿡰� ��ӹ��� �޼��嵵 �����ϰ� �ڽ��� ���� �޼��嵵 �����ϴ�.
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