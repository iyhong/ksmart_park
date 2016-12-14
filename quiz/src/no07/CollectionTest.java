package no07;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {
	public static void main(String[] args) {
		ArrayList<Singer> list = new ArrayList();
		Singer singer;
		
		singer = new Singer();

		singer.setName("admin");
		singer.setAge(30);
		list.add(singer);
		
		//������ ����� guest �� �ι� ��µ�
		//���ο� ��ü�� �ٽ� �����ؼ� �� ��ü�� ����Ʈ�� �����ؾ� �Ѵ�.
		singer = new Singer(); 
		
		singer.setName("guest");
		singer.setAge(32);
		list.add(singer);

		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println((((Singer) i.next()).getName()));
		}
	}
}

class Singer {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}