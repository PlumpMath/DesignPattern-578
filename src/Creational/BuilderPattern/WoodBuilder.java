package Creational.BuilderPattern;

public class WoodBuilder extends HouseBuilder {	
	public Floor createFloor() {
		floor = new WoodFloor();
		return floor;
	}
	
	public Walls createWalls() {
		walls = new WoodWalls();
		return walls;
	}
	
	public Roof createRoof() {
		roof = new WoodRoof();
		return roof;
	}

	public House createHouse() {
		house = new WoodHouse();
		return house;
	}
}
