package goblin_Tower;

public class Runner {
	public static void main(String[] args) {
		Hero Player = new Hero();
		Goblin Goblin = new Goblin();
	
		battle(Player,Goblin);
		
		
	
	}
	
	
	
	
	
	
	public static void battle(Hero Player, Goblin Goblin) {
		System.out.println("You have encountered a Goblin get ready to fight ");
		int Phase = 1;
		boolean noknockout = true;
		while (noknockout) {
			if (Player.getcurrHealth() == 0) {
				// GAMEOVER METHOD
				System.out.println("You have lost all your health GAMEOVER");
				break;
			}
			if (Goblin.getcurrHealth() == 0) {
				System.out.println("YOU WON    +2 Gold");	
				Player.setGold(Player.getGold()+2);
				break;
			}
			System.out.println("-------------------------------");
			System.out.println("Attack Phase "+ Phase);
			Player.attack(Goblin);
			Goblin.attack(Player);
			
			Phase=Phase +1;
			
		
		}
	}
	
}
