package AdapterWrapper;

//	@PlainWords
//		Adapter pattern lets you wrap an
//		otherwise incompatible object in
//		an adapter to make it compatible
//		with another class

//	@Wikipedia
//		In software engineering, the adapter
//		pattern is a software design pattern
//		that allows the interface of an
//		existing class to be used as another
//		interface. It is often used to make
//		existing classes work with others
//		without modifying their source code.

//	@Slides
//		This pattern is useful when we want
//		to incorporate a class from an existing
//		project into a similar one with a
//		different behaviour

public interface RowingBoat {

	void row(); // Action of rowing...
}
