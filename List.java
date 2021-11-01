
public interface List {
	public int length(); 
	public boolean insert(Object item, int position); 	
	public boolean remove(Object item); 
	public Object remove(int position);
	public void add(Object item); 
	public int find(Object item); 
	public Object get(int position); 
	public boolean isEmpty(); 
	public void clear(); 
}
