package homework1;

public abstract class Location {
	String name;
	String description;
	
	public Location(String name, String location) {
		this.name = name;
		this.description = description;
	}
	public abstract void look();
	public abstract void use(String objectName);
	public abstract void talk(String characterName);
	
}
