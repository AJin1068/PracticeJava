package HashMap;

import java.util.HashMap;

public class PutIfAbsent_GetOrDefault {

	
	public static void GetOrDefault(String[] avengers) {
		
	
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String a : avengers) {
			
			//a�� �ش��ϴ� ���� ������ 1����, �������� �ߺ� ����� overwrite�� �ƴ� �ش� value+1�� �����
			map.put(a, map.getOrDefault(a, 0)+1);
		}
	
		System.out.println(map.toString());
		
		//a������ ��� ���� map�� key�� ������ value��ȯ, �׷��� ������ 1�� value's default
		System.out.println(map.getOrDefault("steve", 1));
	}
	
	public static void PutIfAbsent(String[] avengers) {
		//absent:����ִ� 
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String a : avengers) {
			
			map.put(a, map.getOrDefault(a, 0)+1);
		}
	
		System.out.println(map.toString());
		
		//a������ ��� ���� map�� key�� ������ �ǳʶ��, �׷��� ������ key+value put.
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
	
	

