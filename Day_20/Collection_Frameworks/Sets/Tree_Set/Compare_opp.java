package Day_20.Collection_Frameworks.Sets.Tree_Set;
import java.util.Comparator;
public class Compare_opp implements Comparator<Employee>{
    @Override
    public int compare(Employee a , Employee b){
        return b.salary - a.salary;
    }
}
