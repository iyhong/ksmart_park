package no05;

public class Array {
	public static void main(String[] args) {
		int ar[][] = new int[3][];
		int value = 0;

		ar[0] = new int[2];
		ar[1] = new int[3];
		ar[2] = new int[4];

		for (int out = 0; out < ar.length; out++) {
			for (int in = 0; in < ar[out].length; in++) {
				ar[out][in] = ++value;
			}
		}
		try {
			for (int out = 0; out < ar.length; out++) {
				for (int in = 0; in < ar.length; in++) {	//in < ar[out].length 로 조건을 줘야 정상적으로 실행되서 1,2,...9가 출력됨.
					System.out.println(ar[out][in]);
				}	//ar.length 번 반복시키면 3번돌아야되는데 ar[0][] 은 길이가 2밖에 안되므로 예외발생됨
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		}
	}
}
