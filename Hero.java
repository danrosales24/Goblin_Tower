package goblin_Tower;

public class Hero {
	int maxHealth;
	int attackPower;
	int defensePower;
	int gold;


public Hero(){
	maxHealth =(int) (Math.random() * (30-20) + 20);
	attackPower =(int) (Math.random() * (3-1) + 1);
	defensePower =(int) (Math.random() * (5-1) + 1);
	gold =0;
	

	
	
	
	}
}
