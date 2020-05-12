package BuilderPattern;

public class Builder {
	
	protected final Profession profession;
	protected final String name;
	protected HairType hairType;
	protected HairColor hairColor;
	protected Armor armor;
	protected Weapon weapon;

	public Builder(Profession profession, String name) {
		if (profession == null || name == null) {
			throw new IllegalArgumentException("profession and name can not be null");
		}
		this.profession = profession;
		this.name = name;
	}

	public Builder withHairType(HairType hairType) {
		this.hairType = hairType;
		return this;
	}

	public Builder withHairColor(HairColor hairColor) {
		this.hairColor = hairColor;
		return this;
	}

	public Builder withArmor(Armor armor) {
		this.armor = armor;
		return this;
	}

	public Builder withWeapon(Weapon weapon) {
		this.weapon = weapon;
		return this;
	}

	public Hero build() {
		return new Hero(this);
	}
}
