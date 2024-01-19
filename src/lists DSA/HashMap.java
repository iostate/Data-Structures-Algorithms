package lists;

import java.util.LinkedList;
import java.util.List;

public class HashMap {
	
	final List<int[]>[] buckets;
	private int SIZE = 10_000;
	
	public HashMap() {
		buckets = new LinkedList[SIZE];
		for(int i = 0; i < SIZE; i++) {
			buckets[i] = new LinkedList<>();
		}
	}
	
	// (1, 10) => [[1,10]]
	// (2, 30) => [[1,10], [2,30]]
	
	public void put(int key, int value) {
		int index = key % SIZE;
		
		// If key already exists, replace element
		for(int[] entry : buckets[index]) {
			if(entry[0] == key) {
				entry[1] = value;
			}
		}
		
		buckets[index].add(new int[] {key, value});
	}
	
	public int get(int key) {
		int index = key % SIZE;
		
		// If key exists, return value
		for(int[] entry : buckets[index]) {
			if(entry[0] == key) {
				return entry[1];
			}
		}
		return -1;
	}
	
	public void remove(int key) {
		int index = key % SIZE;
		
		for(int[] entry : buckets[index]) {
			if(entry[0] == key) {
//				buckets[index].removeIf(-> entry[0] == key);
			}
		}
	}
	
	public boolean contains(int key) {
		int index = key % SIZE;
		
		for(int[] entry : buckets[index]) {
			if(entry[0] == key) {
				return true;
			}
		}
		
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap m = new HashMap();
		m.put(1,10);
		m.put(1, 9);
		m.remove(1);
		m.remove(1);
		int res = m.get(1);
		System.out.println(res);
		
		boolean containsOne = m.contains(2);
//		System.out.println(containsOne);
		System.out.println(3 % 10);
	}

}
