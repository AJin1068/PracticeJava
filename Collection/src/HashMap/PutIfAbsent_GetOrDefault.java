package HashMap;

import java.util.HashMap;

public class PutIfAbsent_GetOrDefault {

	
	public static void GetOrDefault(String[] avengers) {
		
	
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String a : avengers) {
			
			//a에 해당하는 값이 있으면 1저장, 다음부터 중복 저장시 overwrite가 아닌 해당 value+1로 저장됨
			map.put(a, map.getOrDefault(a, 0)+1);
		}
	
		System.out.println(map.toString());
		
		//a변수에 담긴 값이 map의 key에 있으면 value반환, 그렇지 않으면 1이 value's default
		System.out.println(map.getOrDefault("steve", 1));
	}
	
	public static void PutIfAbsent(String[] avengers) {
		//absent:비어있는 
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String a : avengers) {
			
			map.put(a, map.getOrDefault(a, 0)+1);
		}
	
		System.out.println(map.toString());
		
		//a변수에 담긴 값이 map의 key에 있으면 건너띄고, 그렇지 않으면 key+value put.
		map.putIfAbsent("ironMan", 1);
		System.out.println(map.toString());

		map.putIfAbsent("ironMan", 2);
		System.out.println(map.toString());
	}
	
	public static void main(String[] args) {
	
		String[] avengers = {"steve", "hulk", "thor", "steve"};
		
	   PutIfAbsent_GetOrDefault.GetOrDefault(avengers); 
	   PutIfAbsent_GetOrDefault.PutIfAbsent(avengers); 
	}
		
}
	
	

