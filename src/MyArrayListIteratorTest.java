
/**
 * This code is the same code written for the MyLinkedListIteratorTest with all of the instances of MyLinkedList
 * replaced with MyArrayList
 * 
 * This is used to test the methods of the private class ArrayListIterator within the class MyArrayList
 */

import static org.junit.Assert.*;
import java.util.NoSuchElementException;
import java.util.ListIterator;
import org.junit.Test;

public class MyArrayListIteratorTest {
	static final int MAX = 10;

	static <E> void checkNoNext(ListIterator<E> itr) {
		try {
			itr.next();
			fail("Shouldn't get here.");
		} catch (NoSuchElementException e) {
			// Should get here.
		} catch (Exception e) {
			fail("Shouldn't get here either.");
		}
	}

	static <E> void checkNoPrev(ListIterator<E> it) {
		try {
			it.previous();
			fail("Shouldn't get here.");
		} catch (NoSuchElementException e) {
			// Should get here.
		} catch (Exception e) {
			fail("Shouldn't get here either.");
		}
	}

	/**
	 * Make sure iterators work correctly with an empty list.
	 */
	@Test
	public void testEmpty() {
		MyArrayList<Integer> ill = new MyArrayList<>();
		ListIterator<Integer> it = ill.iterator();

		assertFalse(it.hasNext());
		assertFalse(it.hasPrevious());

		checkNoNext(it);
		checkNoPrev(it);
	}

	/**
	 * Make sure iterators work correctly with a list of one element.
	 */
	@Test
	public void testSingle() {
		MyArrayList<Integer> ill = new MyArrayList<>();
		ListIterator<Integer> it;
		Integer i;

		ill.add(0);

		it = ill.iterator();

		assertTrue(it.hasNext());
		assertFalse(it.hasPrevious());

		checkNoPrev(it);

		i = it.next();
		assertEquals(new Integer(0), i);

		assertFalse(it.hasNext());
		assertTrue(it.hasPrevious());

		checkNoNext(it);
	}

	/**
	 * Test a larger list by traversing it forwards and backwards in its
	 * entirety.
	 */
	@Test
	public void testBackAndForth() {
		MyArrayList<Integer> ill = new MyArrayList<>();
		ListIterator<Integer> it;
		int i;

		// Add some elements...
		for (int chk = -1; chk < MAX + 1; chk++) {
			ill.add(chk);
		}

		/*
		 * Remove element from the front, back, and middle of list to ensure all
		 * links/indexing are done properly. If links/indexing is broken,
		 * iterators will behave incorrectly.
		 */
		ill.remove(0);
		ill.remove(ill.size() - 1);
		ill.add(MAX / 2, 88);
		ill.remove(MAX / 2);

		assertEquals(MAX, ill.size());

		// Move forward to the end of list...
		it = ill.iterator();
		i = 0;
		while (it.hasNext()) {
			int j;

			j = it.next();
			assertEquals(j, i);
			i++;

			// Check for excessive looping/infinite loop...
			assertTrue(i <= MAX);
		}

		// Make sure we iterated through the correct number of elements...
		assertEquals(MAX, i);

		while (it.hasPrevious()) {
			i--;
			assertEquals(new Integer(i), it.previous());

			// Check for excessive looping/infinite loop...
			assertTrue(i >= 0);
		}

		// 'i' should be zero if we iterated over the correct number of
		// elements.
		assertEquals(0, i);
	}

	/**
	 * Make sure the list class implements the iterable correctly interface by
	 * using the 'for' loop that iterates over a container.
	 */
	@Test
	public void testFor() {
		MyArrayList<Integer> ill = new MyArrayList<>();

		// Add some elements...
		for (int i = 0; i < MAX; i++) {
			ill.add(i);
		}

		// Make sure the elements were added correctly using the iterator
		// version
		// of a for loop.
		int chk = 0;
		for (Integer i : ill) {
			assertEquals(new Integer(chk), i);
			chk++;
		}
	}

	@Test
	public void testIndex() {
		MyArrayList<Integer> ill = new MyArrayList<>();
		ListIterator<Integer> it;
		int i;

		// Add some elements...
		for (i = 0; i < MAX; i++) {
			ill.add(i);
		}

		it = ill.iterator();
		i = 0;
		while (it.hasNext()) {
			assertEquals(new Integer(i), ill.get(it.nextIndex()));
			it.next();
			i++;

			// Check for excessive looping/infinite loop...
			assertTrue(i <= MAX);
		}

		assertEquals(ill.size(), it.nextIndex());

		while (it.hasPrevious()) {
			i--;
			assertEquals(new Integer(i), ill.get(it.previousIndex()));
			it.previous();

			// Check for excessive looping/infinite loop...
			assertTrue(i >= 0);
		}

		assertEquals(-1, it.previousIndex());
	}

	/**
	 * @author Zachery Knoebel
	 * 
	 *         methods added to test add(), remove() and set() methods in the
	 *         private class ListIterator within the class MyArrayList
	 */
	@Test
	public void testAdd() {
//		MyArrayList<Integer> ial = new MyArrayList<>();
//
//		// Add two elements so we get [0, MAX-1]
//		ial.add(0);
//		ial.add(MAX - 1);
//
//		// Add elements in the middle so we get [0, 1, 2, 3, ..., MAX-1]
//		for (int i = MAX - 2; i >= 1; i--) {
//			ial.add(1, i);
//		}
//
//		// Make sure array list looks good...
//		for (int i = 0; i < MAX; i++) {
//			assertEquals(new Integer(i), ial.get(i));
//		}
//
//		// Test boundaries (add at index 0 and the very end). Array list
//		// should contain [-1, 0, 2, 3, ..., MAX]
//		ial.add(0, -1);
//		ial.add(ial.size(), MAX);
//
//		// Check contents of array list...
//		for (int i = -1; i < MAX + 1; i++) {
//			assertEquals(new Integer(i), ial.get(i + 1));
//		}
//
//		// Make sure size is ok...
//		assertEquals(MAX + 2, ial.size());

	}

	@Test
	public void testSet() {
//		MyArrayList<Integer> ial = new MyArrayList<>();
//
//		for (int i = 0; i < MAX; i++) {
//			ial.add(i);
//		}
//
//		for (int i = 0; i < MAX; i += 2) {
//			Integer tmp;
//
//			// Set a new value and make sure it returns the expected old
//			// value...
//			tmp = ial.set(i, i * 2);
//			assertEquals(new Integer(i), tmp);
//			assertEquals(new Integer(i * 2), ial.get(i));
//		}
//
//		// Check invalid indices...
//		try {
//			assertEquals(null, ial.get(-1));
//			fail("Bad stuff");
//		} catch (ArrayIndexOutOfBoundsException e) {
//		}
//
//		try {
//			assertEquals(null, ial.get(MAX + 10));
//			fail("Bad stuff");
//		} catch (ArrayIndexOutOfBoundsException e) {
//		}

	}

	@Test
	public void testRemove() {
		/*
		 * Add code to test removing elements from the array list. These tests
		 * can be added to separate test case methods (they don't all need to be
		 * in here). - Test should cover removing from beginning, middle, and
		 * end. + Test should also verify the size of the array list is correct
		 * + Test should check for removing an invalid index (negative or too
		 * big).
		 */
//
//		MyArrayList<Integer> ial = new MyArrayList<>();
//
//		for (int i = 10; i > 0; i--) {
//			ial.add(i);
//		}
//		// verify the size of the array list is correct
//		assertEquals(ial.size(), 10);
//
//		// removing from beginning, middle, and end
//		ial.remove(9);
//		ial.remove(0);
//		ial.remove(5);
//
//		// Check invalid indices...
//		try {
//			assertEquals(null, ial.get(-1));
//			fail("Bad stuff");
//		} catch (ArrayIndexOutOfBoundsException e) {
//		}
//
//		try {
//			assertEquals(null, ial.get(MAX + 10));
//			fail("Bad stuff");
//		} catch (ArrayIndexOutOfBoundsException e) {
//		}

	}
}