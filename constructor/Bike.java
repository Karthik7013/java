class  Bike{

	String bname;
	String company;
	int speed;

	Bike(String bname,String company,int speed){
		this.bname = bname;
		this.company = company;
		this.speed = speed;
	}
	public void engineStart(){
		System.out.println("Engine start .....");
	}


	public void engineOff(){
		System.out.println("Engine off .....");
	}


}
