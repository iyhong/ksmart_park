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
		//�ƽ�Ű �ڵ带 �̿��� ���
		//�ƽ�Ű�ڵ�� char ������ ���ڸ� �־��ָ��
		//ex) char a = 65; System.out.println(a); -> �ϸ� A ���
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
