package SimpleFactory;

public class ElfWeapon implements Weapon {

	WeaponType weaponType;
	
	ElfWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}
	
	@Override
	public WeaponType getWeaponType() {
		// TODO Auto-generated method stub
		return null;
	}

}
