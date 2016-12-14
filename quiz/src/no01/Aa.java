package no01;

import java.io.*;

public class Aa {
	static String fileName = "D:/test.txt";	//경로를 적어줘야 함 만약 그냥"test.txt"라고만 할경우 프로젝트와 같은 위치에 있어야함
	static FileInputStream fis = null;	//가져올때

	public static void main(String[] args) {
		try {
			fis = new FileInputStream(fileName);
			/*do {	//원래 문제
				System.out.print((char) fis.read());
				
			} while (fis.read() != -1);*/
			int i = 0;	
			while((i = fis.read()) != -1){	//정상적으로 나오는 코드
				System.out.print((char)i);
			}
			/*while(i != -1){	//정상적으로 나오는 코드
				i = fis.read();
				System.out.print((char)i);
				System.out.println(i);
			}*/
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 발생");
		} catch (IOException e) {
			System.out.println("IOException 발생");
		} finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("file.close():예외발생");
			}
		}
	}
}