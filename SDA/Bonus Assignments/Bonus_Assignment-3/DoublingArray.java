import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class DoublingArray<E> implements Iterable<E>{
	
	protected int maxSize = 1;
	protected int size = 0;
	protected Object[] array = new Object[maxSize];	

	public boolean add(E e){
		//TODO:Add the element e to the array. 
		//If the array is too small, double the size.
		return false;
	}
	
	public boolean addAll(Collection<? extends E> c){
		//TODO:Add the collection c to the array
		return false;
	}

	public void clear(){
		//TODO:empty the array completely
	}

	public boolean contains(Object o){
		//TODO:Check if the object o exists in the array
		return false;		
	}
	
	public boolean containsAll(Collection<?> c){
		//TODO:Check if all the elements of collection c are in the array
		return false;
	}
	
	public boolean isEmpty(){
		//TODO:return whether the array is empty
		return false;
	}

	public boolean remove(Object o){
		//TODO:Remove the first instance of object o in the array.
		//Shift the data in the array to avoid any gaps therein.
		return false;
	}

	public boolean removeAll(Collection<?> c){
		//TODO:Remove all elements from c which exist in the array
		//in accordance with the "remove(Object o)" implementation.
		return false;
	}

	public boolean retainAll(Collection<?> c){
		//TODO:Remove all elements but those equal to the ones in
		//collection c in accordance to the "remove(Object o)"
		// implementation.
		return false;
	}

	public int size(){
		//TODO: return the size of the array
		return 0;
	}

	public Object[] toArray(){
		//TODO: return a copy of the array
		return null;
	}

	@SuppressWarnings("unchecked")
	public <T> T[] toArray(T[] a) {
		if (a.length < size)
			return (T[]) Arrays.copyOf(array, size, a.getClass());
		System.arraycopy(array, 0, a, 0, size);
		if (a.length > size)
			a[size] = null;
		return a;
	}

	public String toString(){
		return Arrays.toString(array);
	}

	public Iterator<E> iterator() {
		//TODO:Return an instance of my iterator
		return null;
	}

	private class MyIterator implements Iterator<E> {
		private int index = -1;
		boolean nextCalled;
	
		public boolean hasNext() {
			//TODO:return whether there is a next element in the array
			return false;
		}

		@SuppressWarnings("unchecked")
		public E next() {
			//TODO:return the next element in the array and increase
			//the index counter.
			return null;
		}

		public void remove() {
			if(nextCalled){
				DoublingArray.this.remove(index);
				index--;
				nextCalled = false;
			}
			else
				throw new IllegalStateException;
		}
	}
}