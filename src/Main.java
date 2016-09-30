
public class Main {

	public static void main(String[] args) {

		// Creates the eight lists to be tested. The contact lists will sort themselves, the other two will
		// be sorted by the various sort methods
		ArrayContactList aCList0 = new ArrayContactList();
		LinkedContactList lCList0 = new LinkedContactList();
		MyArrayList<Contact> aList1 = new MyArrayList<Contact>();
		MyLinkedList<Contact> lList1 = new MyLinkedList<Contact>();
		MyArrayList<Contact> aList2 = new MyArrayList<Contact>();
		MyLinkedList<Contact> lList2 = new MyLinkedList<Contact>();
		MyArrayList<Contact> aList3 = new MyArrayList<Contact>();
		MyLinkedList<Contact> lList3 = new MyLinkedList<Contact>();

		// Creates an array of Contacts to test the MyArrayList and ContactList classes
		Contact[] contactListTest = new Contact[26];
		contactListTest[0] = new Contact("AAron", "Black", "Array Listery", "1-234-567-8900", "1-555-432-3456",
				"1-875-234-9765", "ABlack@esnail.edu");
		contactListTest[1] = new Contact("Barry", "HornField", "Array Listery", "1-766-900-1234", "1-233-543-6547",
				"1-875-234-9765", "BField@esnail.edu");
		contactListTest[2] = new Contact("Corey", "Karington", "Array Listery", "1-678-000-2578", "1-222-666-7777",
				"1-875-234-9765", "CKarington@esnail.edu");
		contactListTest[3] = new Contact("Darrel", "Waffelhausen", "Array Listery", "1-000-333-6666", "1-030-494-8901",
				"1-875-234-9765", "DWorther@esnail.edu");
		contactListTest[4] = new Contact("Ellen", "Smith", "Array Listery", "1-857-000-5432", "1-666-908-9900",
				"1-875-234-9765", "ESmith@esnail.com");
		contactListTest[5] = new Contact("Francis", "Forello", "Array Listery", "1-000-923-4455", "1-667-333-5970",
				"1-875-234-9765", "FForello@esnail.com");
		contactListTest[6] = new Contact("Greg", "Moore", "Array Listery", "1-456-111-2345", "1-999-567-4968",
				"1-875-234-9765", "GMoore@esnail.com");
		contactListTest[7] = new Contact("Hellena", "Snarl", "Array Listery", "1-831-844-4868", "1-789-321-7813",
				"1-875-234-9765", "HSnarl@esnail.com");
		contactListTest[8] = new Contact("Isabell", "Berkley", "Array Listery", "1-987-654-1478", "1-987-789-1236",
				"1-875-234-9765", "EBerkley@esnail.com");
		contactListTest[9] = new Contact("Julie", "Jensen", "Array Listery", "1-222-666-7894", "1-321-654-7899",
				"1-875-234-9765", "JJensen@esnail.com");
		contactListTest[10] = new Contact("Kyle", "McDoogle", "Array Listery", "1-888-335-6598", "1-321-789-4598",
				"1-875-234-9765", "KMcDoogle@esnail.com");
		contactListTest[11] = new Contact("Lawrence", "Flemming", "Array Listery", "0-555-985-4895", "1-456-456-1687",
				"1-875-234-9765", "LFlemming@esnail.com");
		contactListTest[12] =
				new Contact("Mike", "Glasgo", "Array Listery", "0", "0", "1-875-234-9765", "MGlasgo@esnail.com");
		contactListTest[13] = new Contact("Nedward", "Wentsworth", "Array Listery", "1-440-563-8915", "1-458-832-3456",
				"1-875-234-9765", "NWentsworth@esnail.com");
		contactListTest[14] = new Contact("Oskarr", "Squinktersmith", "Array Listery", "1-486-891-1111", "0",
				"1-875-234-9765", "OSquinktersmith@esnail.com");
		contactListTest[15] = new Contact("Patricia", "Merkel", "Array Listery", "1-483-332-5612", "0", "1-875-234-9765",
				"PMerkel@esnail.com");
		contactListTest[16] = new Contact("Qitra", "Sorrento", "Array Listery", "1-878-879-9999", "0", "1-875-234-9765",
				"QSorrento@esnail.com");
		contactListTest[17] = new Contact("Ralph", "Flemming", "Array Listery", "1-487-323-5689", "1-888-945-3654",
				"1-875-234-9765", "RFlemming@esnail.com");
		contactListTest[18] = new Contact("Samial", "Smith", "Array Listery", "1-857-000-4457", "1-666-908-9900",
				"1-875-234-9765", "SSmith@esnail.com");
		contactListTest[19] = new Contact("Tedward", "Wentsworth", "Array Listery", "1-542-789-8888", "0", "1-875-234-9765",
				"TWentsworth@esnail.com");
		contactListTest[20] = new Contact("Urdel", "Flippenstock", "Array Listery", "0", "1-555-666-9898", "1-875-234-9765",
				"UFlippenstock@esnail.com");
		contactListTest[21] = new Contact("Valentina", "Ferrara", "Array Listery", "1-856-489-3278", "0", "1-875-234-9765",
				"VFerrara@esnail.com");
		contactListTest[22] =
				new Contact("Waldo", "Arlington", "Array Listery", "0", "0", "1-875-234-9765", "WArlington@esnail.com");
		contactListTest[23] =
				new Contact("Xeekiel", "Quint", "Array Listery", "0", "0", "1-875-234-9765", "XQuint@esnail.com");
		contactListTest[24] = new Contact("Yannie", "Alexzandrovich", "Array Listery", "0", "1-842-876-2414",
				"1-875-234-9765", "YAlexzandrovich@esnail.com");
		contactListTest[25] = new Contact("Zebadia", "Ford", "Array Listery", "1-648-348-6844", "1-757-681-8645",
				"1-875-234-9765", "ZFord@esnail.com");

		// adds contacts to the lists
		for (int i = 0; i < 26; i++) {
			aCList0.add(contactListTest[i]);
		}
		for (int i = 0; i < 26; i++) {
			lCList0.add(contactListTest[i]);
		}
		for (int i = 0; i < 26; i++) {
			aList1.add(contactListTest[i]);
		}
		for (int i = 0; i < 26; i++) {
			lList1.add(contactListTest[i]);
		}
		for (int i = 0; i < 26; i++) {
			aList2.add(contactListTest[i]);
		}
		for (int i = 0; i < 26; i++) {
			lList2.add(contactListTest[i]);
		}
		for (int i = 0; i < 26; i++) {
			aList3.add(contactListTest[i]);
		}
		for (int i = 0; i < 26; i++) {
			lList3.add(contactListTest[i]);
		}

		//tests iterator by the use of the special for loop and also prints out the contacts first and last names
		System.out.println("");
		System.out.println("Unsorted MyArrayList of Contacts");
		System.out.println("________________________________________________");
		for (Contact c: aList1) {
			System.out.println(c);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Unsorted MyLinkedList of Contacts");
		System.out.println("________________________________________________");
		for (Contact c: lList1) {
			System.out.println(c);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Sorted MyArrayContactList of Contacts");
		System.out.println("________________________________________________");
		for (Contact c: aCList0) {
			System.out.println(c);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Sorted MyLinkedContactList of Contacts");
		System.out.println("________________________________________________");
		for (Contact c: lCList0) {
			System.out.println(c);
		}
		
		ContactComparator comp = new ContactComparator();
		
		aList1.bubbleSort(comp);
		aList2.insertionSort(comp);
		aList3.selectionSort(comp);
		

		System.out.println("");
		System.out.println("");
		System.out.println("Sorted MyArrayList of Contacts (bubble sort)");
		System.out.println("________________________________________________");
		for (Contact c: aList1) {
			System.out.println(c);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Sorted MyArrayList of Contacts (insertion sort)");
		System.out.println("________________________________________________");
		for (Contact c: aList2) {
			System.out.println(c);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Sorted MyArrayList of Contacts (selection sort)");
		System.out.println("________________________________________________");
		for (Contact c: aList3) {
			System.out.println(c);
		}
		
		lList1.bubbleSort(comp);
		lList2.insertionSort(comp);
		lList3.selectionSort(comp);
		

		System.out.println("");
		System.out.println("");
		System.out.println("Sorted MyLinkedList of Contacts (bubble sort)");
		System.out.println("________________________________________________");
		for (Contact c: lList1) {
			System.out.println(c);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Sorted MyLinkedList of Contacts (insertion sort)");
		System.out.println("________________________________________________");
		for (Contact c: lList2) {
			System.out.println(c);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Sorted MyLinkedCList of Contacts (selection sort)");
		System.out.println("________________________________________________");
		for (Contact c: lList3) {
			System.out.println(c);
		}

	}

}
