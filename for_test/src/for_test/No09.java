package for_test;

public class No09 {
	public static void main(String[] args){
		for(int i=0;i<5;i++){
			for(int j=0;j<5-i ;j++){
				System.out.print(" ");
			}
			System.out.print(i+1);
			for(int k=0;k<i;k++){
				System.out.print(" "+(i+1));
			}
			System.out.print("\n");
		}
	}
}
