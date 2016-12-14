package for_test;

public class No10 {
	public static void main(String[] args){
		char[] c = {'z','e','r','o','D','a','y'};
		for(int i=0;i<c.length;i++){
			for(int j=0;j<i+1;j++){
				System.out.print(c[j]);
			}
			System.out.print("\n");
		}
		for(int i=0;i<c.length-1;i++){
			for(int j=0;j<c.length-1-i ;j++){
				System.out.print(c[j]);
			}
			System.out.print("\n");
		}
	}
}
