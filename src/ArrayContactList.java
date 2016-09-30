
/**
 * 
 * @author Zachery Knoebel
 *
 *         this class is used to create an ArrayList like list of Contacts that
 *         will be sorted by name every time the add method is used without and
 *         index
 */
public class ArrayContactList extends MyArrayList<Contact> {

	ContactComparator comp = new ContactComparator();

	ArrayContactList() {
		super();

	}

	@Override
	public boolean add(Contact c) {

		super.add(c);

		insertionSort(comp);
		return true;
	}
}
