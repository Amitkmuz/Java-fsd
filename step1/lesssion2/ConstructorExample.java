class Car {
	Car() {
		System.out.println("Object created...");
	}
	void displayCarInfo() {
		System.out.println("Car Details");
	
	}
}
class ConstructorExample {

	public static void main(String args[]) {
	Car innova = new Car();
	innova.displayCarInfo();
	}
}
