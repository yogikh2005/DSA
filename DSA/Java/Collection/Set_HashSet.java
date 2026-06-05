
import java.util.HashSet;
import java.util.Set;


public class Set_HashSet
{
    public static void main(String[] args) {
        
        Set<Integer>st =  new HashSet<>();

        st.add(11);
        st.add(21);
        st.add(51);
        st.add(11);

        System.err.println(st);

        Set<Integer>st2 =  new HashSet<>();


        st2.add(11);
        st2.add(21);
        st2.add(101);
        st2.add(121);

        System.err.println(st);
        st.retainAll(st2);
        System.err.println(st);

    }
}