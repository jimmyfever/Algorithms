
public class DArray<E> {
	
	private E[] data;
	private int size;

	//constructor, with parameter
	public DArray(int capacity){
		data = (E[])new Object[capacity];
		size = 0;
	}
	// constructor, without parameter, which is 10 for default
	public DArray(){
		this(10);
	}
	
	public DArray(E[] arr) {
		data =(E[]) new Object[arr.length];
		for(int i = 0 ; i < arr.length; i++) {
			data[i] = arr[i];
		}
		size = arr.length;
	}
	public int getSize(){
		return size;
	}
	public int getCapacity(){
		return data.length;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public void addLast(E e){
		add(size, e);
	}
	public void addFirst(E e){
		add(0, e);
	}
	public void add(int index, E e){
		if(index < 0 || index > size)
			throw new IllegalArgumentException("Add failed. Require index >=0 and index <= size.");

		if(size == data.length)
			resize(2 * data.length);

		for(int i = size - 1; i >= index; i--)
			data[i+1] = data[i];
		data[index] = e;
		size++;
	}

	public E get(int index){
		if(index < 0 || index >= size)
			throw new IllegalArgumentException("Get failed. Index is illegal.");
		return data[index];
	}
	public E getLast() {
		return get(size-1);
	}
	public E getFirst() {
		return get(0);
	}

	void set(int index, E e){
		if(index < 0 || index >= size)
			throw new IllegalArgumentException("Get failed. Index is illegal.");
		data[index] = e;
	}

	public boolean contains(E e){
		for(int i = 0; i < size; i++){
			if(data[i].equals(e))
				return true;
		}
		return false;
	}

	public int find(E e){
		for(int i = 0; i < size; i++){
			if(data[i].equals(e))
				return i;
		}
		return -1;		
	}

	// return the value of ele
	public E remove(int index){
		if(index < 0 || index >= size)
			throw new IllegalArgumentException("Remove failed. Index is illegal.");
		E res = data[index];
		for(int i = index+1; i < size; i++)
			data[i-1] = data[i];
		size--;
		data[size] = null; // loitering objects != memory leak
		
		if(size == data.length / 4 && data.length / 2 != 0)
			resize(data.length / 2);
		return res;
	}

	public E removeFirst(){
		return remove(0);
	}

	public E removeLast(){
		return remove(size-1);
	}

	public void removeElement(E e){
		int index = find(e);
		if(index != -1)
			remove(index);
	}
	
	public void swap(int i, int j) {
		if(i < 0 || i >= size || j < 0 || j >= size)
			throw new IllegalArgumentException("Index is illegal.");
		
		E tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}

	@Override
	public String toString(){
		StringBuilder res = new StringBuilder();
		res.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
		res.append('[');
		for(int i = 0; i < size; i++){
			res.append(data[i]);
			if(i != size - 1)
				res.append(",");
		}
		res.append(']');
		return res.toString();
	}

	private void resize(int newCapacity){
		E[] newData = (E[])new Object[newCapacity];
		for(int i = 0; i < size; i++)
			newData[i] = data[i];
		data = newData;
	}

}