package Day_20.Collection_Frameworks.Linked_List;
import java.util.LinkedList;
public class linked {
    public static void main(String[] args) {
        //The warning is coming because we are using rawType and not passing any specific
        //type like Linedlist<String> list. 
        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add(69);
        list.add(69.69f); //here we can see heterogeneous values are being added
        list.add(null);
        //This is just the normal linked list that is simply written in 
        //the java collections framework. 

        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.addFirst("Z");
        System.out.println(list);
        list.addLast("Y");
        System.out.println(list);

        //Other methods Of LinkedList

        list.pop(); //This will remove the first element of the linked list
        System.out.println(list);
        list.push("A"); //This will add the element at the first position of the linked list
        System.out.println(list);
        list.set(2, "B"); //This will set the element at the 2nd position of the linked list
        System.out.println(list);
        list.add(2, "C"); //This will add the element at the 2nd position of the linked list
        System.out.println(list);
        list.removeFirst(); //This will remove the first element of the linked list
        System.out.println(list);
        list.removeLast(); //This will remove the last element of the linked list
        System.out.println(list);
        list.clear(); //This will clear the linked list
        System.out.println(list);
        

    }
}
