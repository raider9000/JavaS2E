package DSA.Hash_maps.Object_class_Implementation_Hashmap;

public class Hashmap_object_class {
    Entry bucket[] = new Entry[16];
    public int getBucketIndex(Object key){
        return Math.abs(key.hashCode()) % bucket.length;
    }
    public void add_Value(Object key , Object value){
        int index = getBucketIndex(key);
        if(bucket[index] == null){
            Entry head = new Entry(key, value);
            bucket[index] = head;
        }else{
            Entry head = bucket[index];
            while(head != null){
                if(head.key == key){
                    head.value = value;
                    return;
                }
                head = head.next;
            }
            Entry entry = new Entry(key, value);
            entry.next = bucket[index];
            bucket[index] = entry;
        }
    }
    public Object get_Value(Object key){
        int index = getBucketIndex(key);
        Entry head = bucket[index];
        if(head == null){
            throw new java.util.NoSuchElementException();
        }
        while(head != null){
            if(head.key == key){
                return head.value;
            }
            head = head.next;
        }
        throw new java.util.NoSuchElementException();
    }
    public void remove_Value(Object key){
        int index = getBucketIndex(key);
        Entry head = bucket[index];
        if(head == null){
            throw new java.util.NoSuchElementException();
        }
        if(head.key == key){
            bucket[index] = head.next;
            head.next = null;
            head = null;
            return;
        }
        while(){
            
        }
    }
}
