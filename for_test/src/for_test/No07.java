package for_test;

public class No07 {
	public static void main(String[] args){
		int x = 3;
		
		for(int i=0;i<x;i++){
			for(int j=0;j<x-1-i ;j++){
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1 ;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=0;i<x-1;i++){
			for(int j=0;j<i+1 ;j++){
				System.out.print(" ");
			}
			for(int k=0;k<x-(i*2) ;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
