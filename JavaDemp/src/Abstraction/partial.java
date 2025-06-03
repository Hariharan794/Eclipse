package Abstraction;

public class partial implements  {
	@Override
	public void privacy() {
		System.out.println("safely handled by database");  //non abstract method
	}

	@Override
	public void chats() {
		System.out.println("chats for all stored in maindatabase");
	}

	@Override
	public void DM() {
		System.out.println("send a driectly messages ");
	}

	public static void main(String[] args) {
		instagram i1 = new instagram();
		i1.privacy();
		i1.chats();
		i1.DM();

	}


}
