
class Bat extends Mammal {
	int energyLevel = 300;
	
	public void fly() {
		energyLevel = energyLevel - 50;
		System.out.println("The bat is taking of to fly! Your energy level is:" + energyLevel);
	}
	
	public void eatHumans() {
		energyLevel = energyLevel + 25;
		System.out.println("The bat....is...eating...HUMANS!!! Your energy level is:" + energyLevel);
	}
	
	public void attackTown() {
		energyLevel = energyLevel - 10;
		System.out.println("The town is being destroyed by the bat! Your energy level is:" + energyLevel);
	}
}

