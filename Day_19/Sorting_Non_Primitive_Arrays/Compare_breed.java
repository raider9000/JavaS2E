package Day_19.Sorting_Non_Primitive_Arrays;

import java.util.Comparator;

public class Compare_breed implements Comparator{
    public int compare(Object a , Object b){
        Dog d1 = (Dog)a;
        Dog d2 = (Dog)b;

        return d1.breed.compareTo(d2.breed);
    }
}
