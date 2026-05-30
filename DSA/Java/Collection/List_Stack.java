
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class List_Stack
{
    public static void main(String[] args) {
        
       List<Integer>list = new Stack<>();

       list.add(11);
       list.add(21);
       list.add(51);

       System.out.println(list);

       list.remove(1);
       System.out.println(list);

       List<Integer>list2 = new Stack<>();

       list2.add(101);
       list2.add(121);
       list2.add(151);

       list.addAll(list2);

       System.out.println(list);
    
       list.removeAll(list2);

       System.out.println(list);

       System.err.println(list.size());

       list2.clear();

       System.err.println(list2.size());

       Iterator<Integer> iterator = list.iterator();

       while (iterator.hasNext()) {
        System.err.println(iterator.next());   

       }

       System.out.println(list.get(0));
       System.out.println(list.get(1));

       list.set(1, 101);

       System.out.println(list);
       
       Object[]arr = list.toArray();
       for (Object obj : arr) {

        System.out.println(obj);   
       }

       System.err.println(list.contains(11));
       System.err.println(list.contains(12));
       
       list.add(8);
       list.add(3);
       list.add(21);

       Collections.sort(list);

       System.out.println(list);

       Collections.sort(list,Collections.reverseOrder());

       System.out.println(list);

       System.out.println(list.isEmpty());

       System.out.println(list.lastIndexOf(30));
       System.out.println(list.lastIndexOf(11));

       list.remove(1);
       list.remove(1);
       list.remove(1);
       list.remove(1);
       
       System.err.println(list);
       
       List<Integer> ll = new Stack<>();
       ll.add(11);
       ll.add(21);
       ll.add(51);
       ll.add(101);
       System.out.println(ll);

       
       System.out.println(ll);

       System.out.println(ll);

       Stack<Integer> st = new Stack<>();

       st.push(101);
       st.push(51);
       st.push(21);
       st.push(11);
       
       System.out.println(st.peek());
       System.err.println(st.pop());

    }
}
