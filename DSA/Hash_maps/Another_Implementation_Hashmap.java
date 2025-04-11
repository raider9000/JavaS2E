package DSA.Hash_maps;

public class Another_Implementation_Hashmap {
    //created an array of size 16 of Entry(non-primitive) type
        Entry bucket[] = new Entry[16];

        public int getBucketIndex(int key){
            //basic formula to get a hashcode from the key. 
            //the basic formula is keyvalue mod length of array = index of the array at which the bucket is stored 
            return Math.abs(Integer.hashCode(key)) % bucket.length;
        }
    
        public void put(int key , int value){
            int index = getBucketIndex(key);

            //if the bucket is empty , then create a new entry and assign it to the bucket
            if(bucket[index] == null){
                Entry head = new Entry(key , value);
                bucket[index] = head;
            }else{
                Entry head = bucket[index];
                //updating the key if the value is already present in the array
                //this is done as hashmap doesnt 
                while(head != null){
                    if(head.key == key){
                        head.value = value;
                        return;
                    }
                    head = head.next;
                    
                }
                //if the key is not present in the array , then creating a new entry and assigning it to the bucket
                Entry newEntry = new Entry(key , value);

                //This updates the linked list and the current element now points to the new entry , similarly to stacks 
                newEntry.next = bucket[index];

                //now makes the current index block of the array contain the new entry as its head , which is how a hashmap index linked list work.
                bucket[index] = newEntry;
            }
        }

        public int get(int key){
            int index = getBucketIndex(key);

            //creating a temporary node head , in order to traverse the linked list
            //at the index position of the array 
            Entry head = bucket[index];

            //returning -1 when the bucket is empty
            if(head == null){
                throw new java.util.NoSuchElementException();
                
            }
            //if the bucket is not empty , then checking for the key in the linked list at the index of the array
            while(head != null){
                if(head.key == key){
                    return head.value;
                }
                head = head.next;
            }
            //if the key is not present in the linked list , then return -1
            throw new java.util.NoSuchElementException();
        }

        public void remove(int key){
            int index = getBucketIndex(key);

            Entry current = bucket[index];
            Entry previous = null;
            while(current != null){
                if(current.key == key){
                    //if the key is found , then check if it is the first element of the linked list
                    if(previous == null){
                        previous = current;
                        bucket[index] = current.next;
                        previous.next = null;
                    }else{
                        previous.next = current.next;
                        current.next = null;
                    }
                    return;
                }
                previous = current;
                current = current.next;
            }
           
        }

        //simple method to display te key and value pairs stored in the hashMap 
        public void display(){
            for(int i = 0 ; i < bucket.length ; i++){
                Entry head  = bucket[i];
                
                System.out.print("Index " + i + " : ");
                while(head != null){
                    System.out.println("Key : " + head.key + "\tValue : " + head.value);
                    head = head.next;
                }
                System.out.println();
        }
        }
}
