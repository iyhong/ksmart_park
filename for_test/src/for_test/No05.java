package for_test;

public class No05 {
	public static void main(String[] args){
		char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};
		int k = 0;
		for(int i = 0;i<5;i++){
			for(int j=0; j<i+1;j++){
				System.out.print(alpha[k]);
				k++;
			}
			System.out.println("");
		}
		//아스키 코드를 이용한 방법
		//아스키코드는 char 형으로 숫자를 넣어주면됨
		//ex) char a = 65; System.out.println(a); -> 하면 A 출력
		/*int k = 65;
		for(int i = 0;i<5;i++){
			for(int j=0; j<i+1;j++){
				System.out.print((char)(k));
				k++;
			}
			System.out.println("");
		}*/
	}
}
