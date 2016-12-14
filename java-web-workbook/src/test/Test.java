package test;

public class Test {
	public static void main(String[] args){
		try {
			Test t = (Test)Class.forName("test.Test").newInstance();
			//Test tIns = (Test)t.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	Test(){
		System.out.println("a()½ÇÇà");
	}
}	
