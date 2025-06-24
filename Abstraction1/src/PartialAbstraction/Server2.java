package PartialAbstraction;

public class Server2 implements Server1 {

	@Override
	public void privacy() {
		System.out.println("it's very beautifully");
	}

	@Override
	public void chats() {
		System.out.println("He are greatest Aritst ");
	}

	@Override
	public void DM() {
		System.out.println("Highest Mountain in peak");
	}
	public static void main(String[] args) {
		Server2 s2 = new Server2();
		s2.privacy();
		s2.chats();
		s2.DM();
	}

}
