package Creational.BuilderPattern;

public class Client {

	public static void main(String[] args) {
		HouseDirector director = new HouseDirector();
		HouseBuilder builder = new WoodBuilder();
		// build a wood house
		House house = director.construcHouse(builder);
		System.out.print("Finished!");
	}

}
