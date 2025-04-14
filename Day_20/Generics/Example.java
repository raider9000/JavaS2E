package Day_20.Generics;

public class Example<T>{
    T data1;
    T data2;

    Example(T data1, T data2){
        this.data1 = data1;
        this.data2 = data2;
    }

    @Override
    public String toString(){
        return data1 + " " + data2;
    }

    public static <T> void print(T[] arr){
        for(T i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Example<Integer> e1 = new Example<Integer>(10,20);
        System.out.println(e1);
        System.out.println(e1.data1 instanceof Integer);

        Example<String> e2 = new Example<String>("Hello", "World");
        System.out.println(e2);

        Integer[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"hello", "world", "demo"};
    }
}
