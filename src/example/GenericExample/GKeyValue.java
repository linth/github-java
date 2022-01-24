package example.GenericExample;

/**
 * Generic + Key, Value.
 * 
 * Reference:
 *  - https://docs.oracle.com/javase/tutorial/java/generics/types.html
 * 
 */
public class GKeyValue {
    public static void main(String[] args) {
        CustomMap<String, Integer> c1 = new OrderCustomerMap<String, Integer>("George", 1);
        CustomMap<String, Integer> c2 = new OrderCustomerMap<String, Integer>("Peter", 2);

        System.out.println("Key: " + c1.getKey() + "; Value: " + c1.getValue());
        System.out.println("Key: " + c2.getKey() + "; Value: " + c2.getValue());
    }
}

interface CustomMap<K, V> {
    public K getKey();
    public V getValue();
}

class OrderCustomerMap<K, V> implements CustomMap<K, V> {
    private K key;
    private V value;

    OrderCustomerMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}