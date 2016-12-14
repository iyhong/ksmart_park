package no04;

public class Game {
	public static void main(String[] args){
		Player p1 = new Player();
		System.out.println(p1.getId());
		System.out.println(p1.getNextId());
		Player p2 = new Player();
		System.out.println(p2.getId());
		System.out.println(p1.getNextId());

		Player p3 = new Player();
		System.out.println(p3.getId());
		System.out.println(p1.getNextId());

	}
}

