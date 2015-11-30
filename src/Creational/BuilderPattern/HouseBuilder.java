package Creational.BuilderPattern;

public abstract class HouseBuilder {
	protected House house;
	protected Floor floor;
	protected Roof roof;
	protected Walls walls;
	
	public abstract House createHouse();
	public abstract Floor createFloor();
	public abstract Roof createRoof();
	public abstract Walls createWalls();
}
