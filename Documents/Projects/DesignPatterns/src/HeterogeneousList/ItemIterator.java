package HeterogeneousList;
// The list contains different classes. It can iterate over
// the objects in the list. The objects of the list would
// implement an interface with preset methods and common
// behaviour.

// CODE FROM DESIGN PATTERNS: ELEMENTS OF REUSABLE OBJECT ORIENTED SOFTWARE


interface ItemIterator {
	  
	boolean hasNext();
	Item next();

}
