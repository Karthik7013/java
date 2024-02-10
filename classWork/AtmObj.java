class AtmObj {
	public static void main(String[] args) {
		Atm user1 = new Atm();
		user1.userName = "karthik";
		user1.atmPin = 1234;
		user1.logIn();
		user1.logOut();
		Atm user2 = new Atm();
		user2.userName = "ravi";
		user2.atmPin = 4321;
		user2.logIn();
		user2.logOut();
		Atm user3 = new Atm();
		user3.userName = "bhanu";
		user3.atmPin = 1111;
		user3.logIn();
		user3.logOut();
	}
}