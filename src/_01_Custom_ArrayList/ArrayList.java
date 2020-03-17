package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] array; 
	
	public ArrayList() {
	array = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return array[loc];
	}
	
	public void add(T val) {
		T[] tempArray = (T[]) new Object[array.length+1];
		tempArray[tempArray.length-1] = val;
		
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}
		
		array = tempArray;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] tempArray = (T[]) new Object[array.length+1];
		
		for (int i = 0; i < tempArray.length; i++) {
			if(i < loc) {
				tempArray[i] = array[i];
			}else if(i > loc) {
				tempArray[i] = array[i-1];
			}else {
				tempArray[i] = val;
			}
		}
		
		array = tempArray;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] tempArray = (T[]) new Object[array.length-1];
		
		for (int i = 0; i < array.length; i++) {
			if(i < loc) {
				tempArray[i] = array[i];
			}else if(i > loc) {
				tempArray[i-1] = array[i];
			}
		}
		
		array = tempArray;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("---");
	}
	
	public boolean contains(T val) {

		for (int i = 0; i < array.length; i++) {
			if(array[i] == val) {
				return true;
			}
		}
		
		return false;
	}
	
	public int size() {
		return array.length;
	}
}