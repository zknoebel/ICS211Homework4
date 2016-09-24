
import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * @author zac
 *
 * @param <E> allows for arrays of any type to be made
 */
public class MyArrayList<E> implements List211<E> {

	private int placeHolder;
	private int size = 0;
	private E[] data;
	private E e;
	private boolean finished;

	//Starts with and empty array of ten
	@SuppressWarnings("unchecked")
	MyArrayList() {

		data = (E[]) new Object[10];
	}

	//checks to see if a specific object is in the array and if it is, return the index that it is located at
	public int indexOf(Object obj) {

		for (int i = 0; i < size; i++) {
			if (obj.equals(data[i])) {
				return i;
			}
		}
		return -1;
	}

	//Checks to see if the given index value is within the MyArrayList size
	public void checkIndex(int index) {

		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
	}

	//Adds element at the end of the list and then returns true
	@Override
	public boolean add(E element) {

		if (size == data.length) {
			reallocate();
		}
		data[size] = element;
		size++;

		return true;
	}

	//Adds element to the array at the given index
	@Override
	public void add(int index, E element) {

		if (size == data.length) {
			reallocate();
		}
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}

		for (int i = size; i > index; i--) {
			data[i] = data[i - 1];
		}
		data[index] = element;

		size++;
	}

	//Takes in a comparator for comparing a specific class and then uses a bubble sort algorithm to sort the array
	public void bubbleSort(Comparator<? super E> compare) {

		for (int i = 0; i < size - 1; i++) {

			finished = true;

			for (int j = 0; j < size - 1 - i; j++) {

				if (compare.compare(data[j], data[j + 1]) > 0) {

					finished = false;
					e = data[j];
					data[j] = data[j + 1];
					data[j + 1] = e;
				}
			}

			if (finished == true) {
				break;
			}
		}
	}

	//Returns the object at the given index
	@Override
	public E get(int index) {

		checkIndex(index);

		return data[index];
	}

	//Takes in a comparator used to compare a specific class and uses an insertion sort algorithm to sort the array
	public void insertionSort(Comparator<? super E> compare) {

		for (int i = 0; i < size - 1; i++) {

			placeHolder = i;

			while (compare.compare(data[placeHolder], data[placeHolder + 1]) > 0) {

				e = data[placeHolder];
				data[placeHolder] = data[placeHolder + 1];
				data[placeHolder + 1] = e;

				if (placeHolder > 0) {
					placeHolder--;
				}
			}
		}
	}

	//moves array objects to an array of double the size
	private void reallocate() {
		data = Arrays.copyOf(data, data.length * 2);
	}

	//removes an object by rewriting over it and shifting all elements with greater indices to the left
	@Override
	public E remove(int index) {

		checkIndex(index);

		e = data[index];

		for (int i = index; i < size - 1; i++) {
			data[i] = data[i + 1];
		}
		size--;
		return e;
	}

	//takes in a comparator to compare a certain class and then uses a selection sort algorithm to sort the array
	public void selectionSort(Comparator<? super E> compare) {

		for (int i = 0; i < size - 1; i++) {

			e = data[i];
			placeHolder = i;

			for (int j = i; j < size; j++) {

				if (compare.compare(e, data[j]) > 0) {

					e = data[j];
					placeHolder = j;
				}
			}

			data[placeHolder] = data[i];
			data[i] = e;
		}
	}

	//overwrites an object at the given index with the given element
	@Override
	public E set(int index, E element) {

		checkIndex(index);

		e = data[index];
		data[index] = element;
		return e;
	}

	@Override
	public int size() {
		return size;
	}

}
