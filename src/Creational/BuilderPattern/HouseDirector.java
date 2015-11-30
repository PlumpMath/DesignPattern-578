package Creational.BuilderPattern;

public class HouseDirector{
	public House construcHouse(HouseBuilder builder) {
		House house = builder.createHouse();
		System.out.print(house.getRepresentation());
		house.setFloor(builder.createFloor());
		System.out.print(house.getFloor().getRepresentation());
		house.setWalls(builder.createWalls());
		System.out.print(house.getWalls().getRepresentation());
		house.setRoof(builder.createRoof());
		System.out.print(house.getRoof().getRepresentation());
		return house;
	}
}
