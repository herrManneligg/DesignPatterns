package SimpleFactory;

import java.util.TreeMap;

public class OrcBlackSmith implements BlackSmith {
	

	TreeMap <WeaponType, OrcWeapon> ORCARSENAL;

	OrcBlackSmith() {
		
	}
	
	@Override
	public Weapon craftWeapon(WeaponType weaponT) {
		// TODO Auto-generated method stub
		return ORCARSENAL.get(weaponT);
	}

}
