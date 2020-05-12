package ProxyPattern;

// @Explanation
//
// 		Imagine a tower where the local wizards go to study their spells.
// 		The ivory tower can only be accessed through a proxy which ensures
// 		that only the first three wizards can enter. Here the proxy represents
// 		the functionality of the tower and adds access control to it.

//	@PlainWords
//
//		Using the proxy pattern, a class represents the functionality of another class.

//	@Wikipedia
//		A proxy, in its most general form, is a class functioning as an interface to
//		something else. A proxy is a wrapper or agent object that is being called by
//		the client to access the real serving object behind the scenes. Use of the
//		proxy can simply be forwarding to the real object, or can provide additional
//		logic. In the proxy extra functionality can be provided, for example caching
//		when operations on the real object are resource intensive, or checking
//		preconditions before operations on the real object are invoked.

public interface WizardsTower {

	void enter(Wizard wizard);
}
