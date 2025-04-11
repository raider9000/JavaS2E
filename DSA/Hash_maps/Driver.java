package DSA.Hash_maps;

public class Driver {
    public static void main(String[] args) {
        Another_Implementation_Hashmap map = new Another_Implementation_Hashmap();
        map.put(42, 10);
        map.put(10, 20);
        map.put(3, 30);
        System.out.println(map.get(42)); // Output: 10
        System.out.println(map.get(10)); // Output: 20
        System.out.println(map.get(3)); // Output: 30
        map.remove(10);
        //map.remove(10);
        System.out.println(map.get(10)); // Throws NoSuchElementException
        map.display();
    }
}
