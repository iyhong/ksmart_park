package no02;

public class IfForTest {
	static int[] arNum = { 7, 9, 1, 4, 5 };

	public static void main(String[] args) {
		int out, in;
		IfForTest t = new IfForTest();
		
		//sort�ϴ¹��� 
		for (out = arNum.length - 1; out > 0; out--) { //out�� 4���� 1���� �� 4���ݺ�
			for (in = 0; in < out; in++) { // ���� for���� �ϼ��Ͻÿ� //in�� 0���� out���� �� out��4�̸�(0����3����)4��, out��3�̸�(0����2����)3�� �ݺ�
				if (arNum[in] > arNum[in + 1]) {	//arNum[0] ���� arNum[1]���� ũ��
					t.swap(in, in + 1);	// ���ΰ��� �ٲ��־� ����ū���ڰ� �ǵڷΰ����� �Ѵ�.
				}
			}
		}
		t.display();
	}

	void swap(int one, int two) {
		int temp = arNum[one];
		arNum[one] = arNum[two];
		arNum[two] = temp;
	}

	void display() {
		for (int index = 0; index < arNum.length; index++) {
			System.out.print(arNum[index]);
		}
	}
}
