package Bridge;

public class SoulEatingEnchantment implements Enchantment {

	@Override
	public void onActivate() {
		System.out.println("The item spreads bloodlust.");
	}

	@Override
	public void apply() {
		System.out.println("The item eats the soul of enemies.");
	}

	@Override
	public void onDeactivate() {
		System.out.println("Bloodlust slowly disappears.");
	}
	
	
	// MAIN METHOD
	public static void main(String[] args) {
		
		var enchantedSword = new Sword(new SoulEatingEnchantment());
		
		enchantedSword.wield();
		enchantedSword.swing();
		enchantedSword.unwield();
		
		// The sword is wielded.
		// The item spreads bloodlust.
		
		// The sword is swinged.
		// The item eats the soul of enemies.
		
		// The sword is unwielded.
		// Bloodlust slowly disappears.

		var hammer = new Hammer(new FlyingEnchantment());
		
		hammer.wield();
		hammer.swing();
		hammer.unwield();
		
		// The hammer is wielded.
		// The item begins to glow faintly.
		
		// The hammer is swinged.
		// The item flies and strikes the enemies finally returning to owner's hand.
		
		// The hammer is unwielded.
		// The item's glow fades.
	}
}