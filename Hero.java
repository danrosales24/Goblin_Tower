package goblin_Tower;



public class Hero {
	
	
	int maxHealth;
	int attackPower;
	int defensePower;
	int gold;
	int currHealth;

	public Hero() {
		maxHealth = (int) (Math.random() * (30 - 20) + 20);
		attackPower = (int) (Math.random() * (3 - 1) + 1);
		defensePower = (int) (Math.random() * (5 - 1) + 1);
		gold = 0;
		currHealth = maxHealth;

	}
	////////////////////////////////
	//set Methods
	
	public void setcurrHealth (int x) {
		currHealth = x;
	}
	
	public void setGold (int x) {
		gold = x;
	}
	
	////////////////////////////////
	//Get Methods
	public int getcurrHealth() {
		return currHealth;
	}
	public int getMaxHealth() {
		return maxHealth;
	}
	public int getattackPower() {
		return attackPower;
	}
	public int getdefensePower() {
		return defensePower;
	}
	public int getGold() {
		return gold;
	}
	////////////////////////////////
	
	
	
	
	public void attack(Goblin Goblin) {
		System.out.println("You attacked the Goblin for " + this.attackPower + " Dmg");
		int temp = this.attackPower - Goblin.getdefensePower();
		Goblin.setcurrHealth(Goblin.getcurrHealth() - temp);
		System.out.println("The Goblin has " + Goblin.getcurrHealth() + " HP left");
	}



}
