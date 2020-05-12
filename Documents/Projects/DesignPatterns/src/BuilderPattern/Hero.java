package BuilderPattern;

public class Hero {

	private final Profession profession;
	private final String name;
	private final HairType hairType;
	private final HairColor hairColor;
	private final Armor armor;
	private final Weapon weapon;

	// This removes the anti-pattern where the constructor would 
	//	be passed several parameters (coupling...)
	public Hero(Builder builder) {
		this.profession = builder.profession;
		this.name = builder.name;
		this.hairColor = builder.hairColor;
		this.hairType = builder.hairType;
		this.weapon = builder.weapon;
		this.armor = builder.armor;
	}
}
