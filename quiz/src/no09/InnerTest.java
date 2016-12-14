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
				/* �� ������ ������ �� �ִ� ������? */
				//����Ŭ������ �������� ��� ���ٰ���
				
				/*.����Ŭ������ ����
				- ����Ŭ�������� �ܺ�Ŭ������ ������� ���� ������ �� �ִ�. 
				- �ڵ��� ���⼺�� ���� �� �ִ�.(ĸ��ȭ) */
				System.out.println("Inner.innerMethod_a : "+a);
				System.out.println("Inner.innerMethod_b : "+b);
				System.out.println("Inner.innerMethod_c : "+c);
				System.out.println("Inner.innerMethod_d : "+d);
				System.out.println("Inner.innerMethod_e : "+e);
			}
		}
		//�޼��峻�� Ŭ���� �ν��Ͻ�ȭ!(Ŭ���� �Ʒ��� ���������.. ���������� Ŭ���� �ִ��� �νĸ���)
		Inner in = new Inner();
		in.innerMethod(7);
	}
}
