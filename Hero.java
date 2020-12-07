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
	
	
	
	
	public int attack(int attP, int heaE, int defE) {
		System.out.println("You attacked the Goblin for " + attP + " Dmg");
		int temp = attP - defE;
		int x = heaE - temp;
		System.out.println("The Goblin has " + x + " HP left");

		return x;

	}

	public static void battle(int playerHealth, int goblinHealth) {
		System.out.println("You have encountered a Goblin get ready to fight ");
		boolean noknockout = true;
		while (noknockout) {
			if (playerHealth == 0) {
				// GAMEOVER METHOD
				System.out.println("You have lost all your health GAMEOVER");
			}
			if (goblinHealth == 0) {
				// Cont. METHOD
				System.out.println("YOU WON    +2 Gold");
			
			}
		
		
		}
	}

}
