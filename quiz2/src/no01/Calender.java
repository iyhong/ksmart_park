package no01;

public class Calender {
	public static void main(String[] args) {
		final int SUN = 1;
		final int MON = 2;
		final int TUE = 3;
		final int WED = 4;
		final int THU = 5;
		final int FRI = 6;
		final int SAT = 7;

		int start = 1;
		int end = 31;
		int startWeek = SUN;
		System.out.println(" SU MO TU WE TH FR SA");
		for (int i = 1; i < startWeek; i++) {
			System.out.print("   "); // "공백3칸"
		}
		for (int i = start, n = startWeek; i <= end; i++, n++) {
			System.out.print((i < 10) ? " 0" + i : " " + i); // (i < 10)? "공백두칸"+i : "공백한칸"+i
			if (n % 7 == 0)	//이렇게하면 매주 토요일에는 줄바꿈이 실행됨
				System.out.println();
		}
	}

}
