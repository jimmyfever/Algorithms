import java.util.*;
public class test {
	
	

	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("hot");
		list.add("dot");
		list.add("lot");
		list.add("log");
		list.add("log");
		System.out.println(list.indexOf("log"));
		System.out.println(list.lastIndexOf("log"));
	}	
}