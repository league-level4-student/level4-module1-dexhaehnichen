package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] array; 
	
	public ArrayList() {
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return array[loc];
	}
	
	public void add(T val) {
		
		array = (T[]) [1];
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}