package dd;
class ground{
	private String name;
	private int price;
	private int building;
	
	
	public ground(String name, int price, int building) {
		this.name = name;
		this.price = price + (int)(price * building * 0.1);
		this.building = building;
	}
}
class start{
	
}
class island{
	
}
public class Map {
	String name;
	int price;
	int building;
	public Map() {
		ground gr = new ground(name, price, building);
		start st = new start();
		island is = new island();
	}
}
