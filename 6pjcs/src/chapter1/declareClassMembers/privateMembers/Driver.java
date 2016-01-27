package chapter1.declareClassMembers.privateMembers;

class Driver {

	void doDriverStuff () {
		SportsCar car = new SportsCar();
		//Cannot invoke a private method using a reference of the class
		//car.goFast();
		
		Convertible con = new Convertible();
		//Cannot invoke a private method using a reference of the (sub)class
		//con.goFast();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
