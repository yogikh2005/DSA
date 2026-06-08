
import java.util.Set;
import java.util.TreeSet;


public class Set_TreeSet
{
    public static void main(String[] args) {
        
        Set<Integer>st =  new TreeSet<>();

        st.add(11);
        st.add(21);
        st.add(51);
        st.add(11);

        System.err.println(st);

        Set<Integer>st2 =   new TreeSet<>();


        st2.add(11);
        st2.add(21);
        st2.add(101);
        st2.add(121);

        System.err.println(st);
        st.retainAll(st2);
        System.err.println(st);

    }
}