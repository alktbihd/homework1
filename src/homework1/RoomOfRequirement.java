package homework1;

public class RoomOfRequirement extends Location{
	Items[] items;
	Character harry;
	public RoomOfRequirement(){
		super("Room of Requirement","Welcome to the room of requirement!, this is a room used to train Dumbledores' Army!");
		items = new Items[] {
			new Items("Books","These books are labeled as defenisive magic which are read by harry potter!"),
			new Items("Training dummy","Training dummy has been punched and dust is all over the place!, this dummy is used by harry potter to practice his spells!")
		};
	harry = new Character("Harry Potter","Hello, welcome to the room! You can practice your spells with me!");
	}
	
	
	@Override
	public void look() {
		System.out.println(description);
		System.out.println(harry.name + "is present!");
	}

	
	@Override
	public void use(String objectName) {
		for(int i =0; i < items.length+1; i++) {
			if(items[i].name.equalsIgnoreCase(objectName)) {
				System.out.println(items[i].description);
				return;
			} 
			System.out.println(objectName + " is not in the room");

		} 
		
			
	
	}

	@Override
	public void talk(String characterName) {
			if(harry.name.equalsIgnoreCase(characterName)) {
				System.out.println(harry.dialogue);
			} else {
			System.out.println("Item is not in the room");
			}
		} 
	}


