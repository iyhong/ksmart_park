package no04;

public class Player {
	private static int nextId = 1;
	private int id;

	public Player() {
		System.out.println("nextId_1 : "+nextId);
		System.out.println("id_1 :"+id);
		id = nextId++;
		System.out.println("nextId_2 :"+nextId);
		System.out.println("id_2 :"+id);
	}

	protected int getId() {
		return id;
	}
	protected int getNextId() {
		return nextId;
	}

	private void setId(int id) {
		this.id = id;
	}
}
