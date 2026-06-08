
import java.util.HashSet;


public class Set_HashSet_2
{
    public static void main(String[] args) {
        
        HashSet<Student> st = new HashSet<>();

        Student s1 = new Student("Yk",11);
        Student s2 = new Student("Yk",11);
        Student s3 = new Student("Yk",11);

        st.add(s3);
        st.add(s2);
        st.add(s1);

        System.err.println(st);

    }
}