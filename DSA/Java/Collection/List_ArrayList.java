
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class List_ArrayList
{
    public static void main(String[] args) {
        
       // List<Integer> list = new ArrayList<>();
       // Collection<Integer>collection = new ArrayList<>();

       ArrayList<Integer>list = new ArrayList<>();

       list.add(11);
       list.add(21);
       list.add(51);

       System.out.println(list);

       list.remove(1);
       System.out.println(list);

       List<Integer>list2 = new ArrayList<>();

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

       ArrayList<Integer> newlist = (ArrayList<Integer>)list.clone();
       System.out.println(newlist);

       ArrayList<Integer>marks = new ArrayList<>();
       marks.ensureCapacity(1000000000);

       System.out.println(newlist.isEmpty());
       System.out.println(marks.isEmpty());

    }
}
