
class Gorilla extends Mammal {
	
	public void throwSomething() {
		energyLevel = energyLevel - 10;
		System.out.println("The gorilla has thrown something! Your energy level is:" + energyLevel);
	}
	
	public void eatBananas() {
		energyLevel = energyLevel + 10;
		System.out.println("The gorilla ate bananas and seems to be happy now! Your energy level is:" + energyLevel);
	}
	
	public void climb() {
		energyLevel = energyLevel - 10;
		System.out.println("The Gorilla has climbed a tree! Your energy level is:" + energyLevel);
	}
}
