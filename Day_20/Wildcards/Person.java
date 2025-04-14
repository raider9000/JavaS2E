package Day_20.Wildcards;

public class Person{
    String name;
    int id;

    Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
