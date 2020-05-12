package SimpleFactory;

public class OrcWeapon implements Weapon {
	
	WeaponType weaponType;
	
	OrcWeapon(WeaponType wt) {
		this.weaponType = wt;
	}
	
	public WeaponType getWeaponType() {
		return null;
	}
	
	public String toString() {
		return "";
	}
}
