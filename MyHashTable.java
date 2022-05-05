import java.util.ArrayList;
import java.util.Objects;

public class MyHashTable <K,V> {
    private ArrayList<HashNode<K,V>> bucketArray;
    private int numBuckets;

    private int size;

    public MyHashTable(){
        bucketArray = new ArrayList<>();
        numBuckets = 10;
        size = 0;

        for (int i = 0; i < numBuckets; i++){
            bucketArray.add(null);
        }
    }

    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size() == 0;
    }

    private int hash (K key){
    }

    public void put(K key, V value){}

    public V get(K key){}

    public V remove (K key){}

    public boolean contains (V value){
    }

    public K getKey(V value ){}

}
