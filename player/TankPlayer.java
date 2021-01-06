package player;
/**
 * Second concrete class of the player class. The player will have more armour and health, but less damage and skill damage if this is chosen.
 * @author Abdullah Ilgun
 */
public class TankPlayer extends PlayerType {

	public TankPlayer(int health, int damage, int armour, int skillDamage, int cPoint, int potAmount) {
		super(health, damage, armour, skillDamage, cPoint, potAmount);
	}
	
	@Override
	public void saySomething() {
		System.out.println("\nYou are now a tank!");
		System.out.println("Health      : 120");
		System.out.println("Damage      : 9");
		System.out.println("Armour      : 6");
		System.out.println("Skill Damage: 12 + armour breaking (Will damage you 3)\n");
	}
}
