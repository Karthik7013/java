class  Gun{

	String GName;
	int bullets;

	public Gun(String GName,int bullets){
		this.GName = GName;
		this.bullets = bullets;
	}
	public void shoot(){
		for(int i = 0;i<=this.bullets;i++){
			System.out.print("=>");
		}
	}
}
