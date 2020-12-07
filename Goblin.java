package goblin_Tower;

public class Goblin {
	int maxHealth;
	int attackPower;
	int defensePower;
	int currHealth;

	public Goblin() {
		maxHealth = (int) (Math.random() * (10 - 5) + 5);
		attackPower = (int) (Math.random() * (3 - 2) + 2);
		defensePower = (int) (Math.random() * (5 - 1) + 1);
		currHealth = maxHealth;

	}

	public void setcurrHealth(int x) {
		currHealth = x;
	}

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

}