package no01;

import java.io.*;

public class Aa {
	static String fileName = "D:/test.txt";	//��θ� ������� �� ���� �׳�"test.txt"��� �Ұ�� ������Ʈ�� ���� ��ġ�� �־����
	static FileInputStream fis = null;	//�����ö�

	public static void main(String[] args) {
		try {
			fis = new FileInputStream(fileName);
			/*do {	//���� ����
				System.out.print((char) fis.read());
				
			} while (fis.read() != -1);*/
			int i = 0;	
			while((i = fis.read()) != -1){	//���������� ������ �ڵ�
				System.out.print((char)i);
			}
			/*while(i != -1){	//���������� ������ �ڵ�
				i = fis.read();
				System.out.print((char)i);
				System.out.println(i);
			}*/
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException �߻�");
		} catch (IOException e) {
			System.out.println("IOException �߻�");
		} finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("file.close():���ܹ߻�");
			}
		}
	}
}