package Day_20.Wildcards;

public class Person{
    String name;
    int id;

    //Constructor of the class
    Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    //Simple overriding of the toString method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
