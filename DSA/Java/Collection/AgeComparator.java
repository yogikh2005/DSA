
import java.util.Comparator;

public class AgeComparator implements Comparator<Student_3>
{

    @Override
    public int compare(Student_3 o1, Student_3 o2) {
       
       if(o1.getAge() == o2.getAge())
       {
        return o1.getName().compareTo(o2.getName());
       }
       
       return o1.getAge() - o2.getAge();
    }

}