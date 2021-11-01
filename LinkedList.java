
public class LinkedList implements List{
	// variables
	public Node head; 
	public int length;
	
	// constructors
	public LinkedList(Object elt) {
		this.head = new Node(elt);
		this.length = 1;
	}
	public LinkedList() {
		this.head = null;
		this.length = 0;
	}

	
	// methods
	public int length() {
		return length;
	}
	
	// TO DO
	public boolean insert(Object item, int position) {
		Node newNode = new Node(item);
		
		if(length < position) { return false; }
		
		if(length == 0) { //only applies if position = 0 and empty
			head = newNode;
			length++;
			return true;
		}
		
		if(position == 0) {
			Node oldHead = head;
			head = newNode;
			head.setNext(oldHead);
			length++;
			return true;
		}
		
		if(position == length) {
			this.add(item);
			return true;
		}
		
		Node current = head;
		
		for(int i = 0; i<position-1; i++) {
			current = current.getNext();
		}
		
		newNode.setNext(current.getNext());
		current.setNext(newNode);
		length++;
		return true;
	}	
	public boolean remove(Object item) {
		return remove(find(item)) != null;
		
	} 
	public Object remove(int position) { 
		if(length == 0 || position >= length || position < 0) {
			return null;
		}
		
		if(position == 0) {
			Node oldH = head;
			head = head.getNext();
			length--;
			return oldH.getElt();	
		}
		Node current = head;
		for(int i = 0; i<position-1; i++) {
			current=current.getNext();
		}
		Object item = current.getNext().getElt();
		current.setNext(current.getNext().getNext());
		length--;
		return item;
		
		
		
		
	}
	
	public void add(Object item) {
		Node tail = new Node(item);
		
		if (length == 0) { // needed to consider the case where head is null
			head = tail;
			length++;
			return;
		}
		
		Node current = head;
		for(int i = 0; i < length-1; i++) {
			current = current.getNext();
		}
		current.setNext(tail);
		length++;
	}
	
	public int find(Object item) {	
		Node current = head;
		for (int i = 0; i<length; i++) {
			if (current.getElt().equals(item)) {
				return i;
			}
			current = current.getNext();
		}
		return -1;
	}  
	
	public Object get(int position) {	
		Node current = head;
		for (int i = 0; i<position; i++) {
			current = current.getNext();
		}
		return current.getElt();
	} 
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void clear() {
		head = null; 
		length = 0;
	}
	
	public String toString() {
		String output = "";
		Node current = head;
		if (current == null) return ""; 
		for (int i = 0; i < length; i++) {
			output += current.toString();
			output += " ";
			current = current.getNext();
		}
		return output;
	}
}
