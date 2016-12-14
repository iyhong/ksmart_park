package no02;

public class IfForTest {
	static int[] arNum = { 7, 9, 1, 4, 5 };

	public static void main(String[] args) {
		int out, in;
		IfForTest t = new IfForTest();
		
		//sort하는문제 
		for (out = arNum.length - 1; out > 0; out--) { //out은 4부터 1까지 총 4번반복
			for (in = 0; in < out; in++) { // 다음 for문을 완성하시오 //in은 0부터 out까지 즉 out이4이면(0에서3까지)4번, out이3이면(0에서2까지)3번 반복
				if (arNum[in] > arNum[in + 1]) {	//arNum[0] 값이 arNum[1]보다 크면
					t.swap(in, in + 1);	// 서로값을 바꿔주어 제일큰숫자가 맨뒤로가도록 한다.
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
