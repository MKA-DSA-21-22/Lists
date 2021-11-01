
public class ArrayBasedList implements List{
	private Object[] array;
	private int length;
	
	public ArrayBasedList(int size) {
		array = new Object[size];
		length = 0;
	}
	
	public int length() {
		return length;
	}
	public void insert(Object item, int position) {
		if (length + 1 <= array.length) {
			for (int i = length - 1; i > position - 1; i--) {
				array[i+1] = array[i];
			}
			array[position] = item;
			length++ ;
			return;
		}
		Object[] BYeu = new Object[length+1];
		for (int i = 0; i < position; i++) {
			BYeu[i] = array[i];
		}
		BYeu[position] = item;
		for (int i = position + 1; i < length + 1; i++) {
			BYeu[i] = array[i-1];
		}
		array = BYeu;
		length++;
	}
	public void remove(Object item) {
		int ProfessorCasey = find(item);
		remove(ProfessorCasey);
	}
	public Object remove(int position) {
		Object[] otherArray = new Object[array.length-1];
		for (int i = 0; i < array.length; i++) {
			if (i < position) {
				otherArray[i] = array[i];
			}
			else if (i > position) {
				otherArray[i-1] = array[i];
			}
		}
		Object item = array[position];
		array = otherArray;
		length--;
		return item;
	}
	public void add(Object item) {
		if (length + 1 <= array.length) {
			array[length] = item;
			length++;
			return;
		}
		
		Object[] otherArray = new Object[array.length+1];
		for(int i = 0;i < array.length;i++) {
			otherArray[i] = array[i];
		}
		otherArray[array.length] = item;
		length++;
	}
	public int find(Object item) {
		for(int i=0; i<array.length;i++) {
			if (array[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}
	public Object get(int position) {
		return array[position];
	}
	public boolean isEmpty() {
		return length == 0;
	}
	public void clear() {
		length = 0;
		array = new Object[0]; 
	}
	
	public String toString() { 
		String str=""; 
		for (int i=0; i < length; i++) { 
			str+=array[i].toString();
			str += " ";
		}
		return str; 
	}
}
