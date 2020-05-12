package Bridge;

//	@Example
//
//		Consider you have a weapon with different enchantments and you
//		are supposed to allow mixing different weapons with different
//		enchantments. What would you do? Create multiple copies of each
//		of the weapons for each of the enchantments or would you just
//		create separate enchantment and set it for the weapon as needed?
//		Bridge pattern allows you to do the second.

//	@PlainWords
//
//		Bridge pattern is about preferring composition over inheritance.
//		Implementation details are pushed from a hierarchy to another
//		object with a separate hierarchy.

//	@Wikipedia
//
//		The bridge pattern is a design pattern used in software engineering
//		that is meant to "decouple an abstraction from its implementation
//		so that the two can vary independently".
//
//	@MyObservations
//
//		This resembles an extension of the Adapter pattern.
//	

public interface Weapon {

	void wield();
	void swing();
	void unwield();
	Enchantment getEnchantment();
}
