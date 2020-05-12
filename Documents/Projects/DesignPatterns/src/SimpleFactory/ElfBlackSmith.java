package SimpleFactory;

import java.util.Map;
import java.util.TreeMap;

public class ElfBlackSmith implements BlackSmith {
	
	Map<WeaponType, ElfWeapon> ELFARSENAL;
	
	ElfBlackSmith() {
		ELFARSENAL = new TreeMap<>();
	}

	@Override
	public Weapon craftWeapon(WeaponType weaponT) {
		return ELFARSENAL.get(weaponT);
	}

}
