package Monopoly;

public class Map {
	private int cout;
	private String startname;
	private String islandname;
	private String commonName;
	private int commonLandPrice;
	private int building;
	private String touristName;
	private int touristLandPrice;
	
	
	public Map(String name, int price, int building) {
		this.commonName = name;
		this.commonLandPrice = price;
		this.building = building;
	}
	
	public Map(String name, int price) {
		this.touristName = name;
		this.touristLandPrice = price;
	}
	
	public Map(String name) {
		this.startname = name;
	}
	
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	public void setCommonLandPrice(int commonLandPrice) {
		this.commonLandPrice = commonLandPrice;
	}
	public void setBuilding(int building) {
		this.building = building;
	}
	public String getCommonName() {
		return commonName;
	}
	public int getCommonLandPrice() {
		return commonLandPrice + (int)(commonLandPrice * building * 0.1);
	}
	public int getBuilding() {
		return building;
	}
	
	public void setTouristName(String touristName) {
		this.touristName = touristName;
	}
	
	public void setTouristLandPrice(int touristLandPrice) {
		this.touristLandPrice = touristLandPrice;
	}
	
	public String getTouristName() {
		return touristName;
	}
	public int getTouristLandPrice() {
		return touristLandPrice;
	}
}