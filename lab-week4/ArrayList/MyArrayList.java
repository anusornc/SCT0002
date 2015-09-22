public class MyArrayList implements MyList {
	// Member Variable or Class Variable
	private Object[] elementData;
	private int size;

	// Constructor for initial Data
	public MyArrayList(int cap) {
		elementData = new Object[cap];
		size = 0;	
	}

	// implement method from interface MyList
	public void add(Object element) {
		if (element == null) throw new IllegalArgumentException();
		resizeArray(size + 1);
		elementData[size++] = element;
	}

	public int size () {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean contains(Object element) {
		/*int c = indexOf(element);
		if c != -1
			return true;
		else
			return false*/

		return indexOf(element) != -1;
	}

	public void remove(Object element) {
		int i = indexOf(element);
		if ( i != -1) {
			elementData[i] = elementData[--this.size];
			elementData[this.size] = null;
		}
	}

	public int indexOf(Object element) {
		for ( int i=0; i < this.size; i++ )
			if (elementData[i].equals(element)) return i;
		return -1;
	}

	public String toString() {
		String allElement="";
		//for each loop
		for ( Object s : this.elementData  ) {
			if (s != null) allElement = allElement + " " + s.toString();
		}
		return allElement;
	}

	private void resizeArray(int capacity) {
		if (capacity > elementData.length) {
			// Compare with Math 
			int newSize = Math.max(capacity , 2 * elementData.length); 
			
			// Create new Array
			Object[] newArray = new Object[newSize];

			// Copy from old array to new array
			for (int i = 0;i < this.size ; i++) {
				newArray[i] = elementData[i];
			}
			elementData = newArray;
		}
	}

}
