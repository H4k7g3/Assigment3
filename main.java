public class main {
    public static void main(String[] args){
        MyHashTable<String, Integer> HashTable = new MyHashTable<>();
        HashTable.add("Milan", 1);
        HashTable.add("Barcelona", 2);
        HashTable.add("Milan", 3);
        HashTable.add("Real Madrid", 4);
        HashTable.add("Juventus", 4);

        System.out.println(HashTable.size());
        System.out.println(HashTable.isEmpty());
        System.out.println(HashTable.remove("Milan"));
        System.out.println(HashTable.remove("Milan"));
        System.out.println(HashTable.get("Milan"));
        System.out.println(HashTable.size());
        System.out.println(HashTable.isEmpty());
    }
}
