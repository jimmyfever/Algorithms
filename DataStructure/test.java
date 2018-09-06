
public class test {
	
	

	public static void main(String[] args){
		DynamicArray<Integer> arr = new DynamicArray<>();

		for(int i = 0; i < 10; i++){
			arr.addLast(i);
		}
		System.out.println(arr);

		arr.add(1, 100);
		System.out.println(arr);

		arr.remove(1);
		System.out.println(arr);

		arr.remove(1);
		System.out.println(arr);
	}	
}