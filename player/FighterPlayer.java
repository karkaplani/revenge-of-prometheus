package player;
/**
 * First concrete class of player. The player will have more damage and skill damage, less health and armour if this is chosen
 * @author Abdullah Ilgun
 */
public class FighterPlayer extends PlayerType{

	public FighterPlayer(int health, int damage, int armour, int skillDamage, int cPoint, int potAmount) {
		super(health, damage, armour, skillDamage, cPoint, potAmount);
	}
	
	@Override
	public void saySomething() {
		System.out.println("\nYou are now a fighter!");
		System.out.println("Health      : 100");
		System.out.println("Damage      : 15");
		System.out.println("Armour      : 5");
		System.out.println("Skill Damage: 20 + armour breaking (Will damage you 5)\n");
	}
}
