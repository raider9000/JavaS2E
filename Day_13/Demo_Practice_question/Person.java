public class Person {
    private String name;
    private int age;

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void display_Person(){
        System.out.println(this.name + " " + this.age);
    }
}
