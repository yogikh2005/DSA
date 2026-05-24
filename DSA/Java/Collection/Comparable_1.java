
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Comparable_1
{
    public static void main(String[] args) {
        
        List<Student_2>st = new ArrayList<>();

        st.add(new Student_2(21,"Yogi",60));
        st.add(new Student_2(19,"More",90));
        st.add(new Student_2(22,"Ybhi",50));
        st.add(new Student_2(22,"Ram",55));

        System.out.println(st);
        
        Collections.sort(st);

        System.out.println(st);

    }
}