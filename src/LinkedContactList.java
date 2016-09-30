
/**
 * 
 * @author Zachery Knoebel
 *
 *         this class is used to create a linked list of Contacts that will be
 *         sorted by name every time the add method is used without and index
 */
public class LinkedContactList extends MyLinkedList<Contact> {

	ContactComparator comp = new ContactComparator();

	LinkedContactList() {
		super();

	}

	@Override
	public boolean add(Contact c) {

		super.add(c);

		insertionSort(comp);
		return true;
	}
}
