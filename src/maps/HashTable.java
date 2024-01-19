package maps;

import java.util.LinkedList;

class KeyValue<K, V> {
	V value;
	K key;

	public KeyValue(K key, V value) {
		this.value = value;
		this.key = key;
	}
}

public class HashTable<K,V> {
	
	
	
	private static int LENGTH = 10;
	  private LinkedList<KeyValue<K, V>>[] data;
	  
	  public HashTable() {
		  data = (LinkedList<KeyValue<K,V>>[]) new LinkedList[LENGTH];
		  for(int i = 0; i < LENGTH; i++) {
				data[i] = new LinkedList<>();
			}
	  }
	  
	  public void put(K key, V value) {
		  int index = hash(key);
		  
		  LinkedList<KeyValue<K,V>> dataBucket = data[index];
		  
		  for(KeyValue<K,V> pair : dataBucket) {
			  if(pair.key.equals(key)) {
				  pair.value = value;
				  return;
			  }
		  }
		  
		  dataBucket.add(new KeyValue<K,V>(key, value));
	  }
	  
	  public V get(K key) {
		  int index = hash(key);
		  
		  LinkedList<KeyValue<K,V>> dataBucket = data[index];
		  
		  for(KeyValue<K,V> pair : dataBucket) {
			  if(pair.key.equals(key)) {
				  return pair.value;
			  }
		  }
		  return null;
	  }
	  
	  public void remove(K key) {
		  int index = hash(key);
		  
		  LinkedList<KeyValue<K,V>> dataBucket = data[index];
		  
		  for(KeyValue<K,V> pair : dataBucket) {
			  if(pair.key.equals(key)) {
				  dataBucket.remove(pair);
			  }
		  }
		  
	  }
	  
	  public int hash(K key) {
		  return key.hashCode();
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashTable<Integer, String> hashTable = new HashTable<>();
		
		hashTable.put(3, "string");;
		hashTable.put(3, "Teste");
		hashTable.put(2, "Teste");
		
		String value = hashTable.get(2);
		System.out.println(value);
	}

}
	
