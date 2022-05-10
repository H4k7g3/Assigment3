public class HashNode<K,V> {
    public int hashCode;
    K key;
    V value;
    HashNode<K,V> next;

    public HashNode(K key, V value, int hashCode){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString (){
        return "{" + key + " " + value + "}";
    }
}
