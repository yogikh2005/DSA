

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Comparator_1
{
    public static void main(String[] args) {
        
        List<Student_3>st = new ArrayList<>();
        

        st.add(new Student_3(21,"Yogi",60));
        st.add(new Student_3(19,"More",90));
        st.add(new Student_3(22,"Ybhi",50));
        st.add(new Student_3(22,"Ram",55));

        System.out.println(st);
         
        
        
        
        
        
        // sort by weight in file

        Collections.sort(st, new Comparator<Student_3>(){
            
            @Override
            public int compare(Student_3 o1 ,Student_3 o2)
            {
                return  o1.getWeight() - o2.getWeight();
            }
        });

        System.out.println(st);

        
        



        
        
        // sort by age by outfile

        Collections.sort(st, new AgeComparator());

        System.out.println(st);

        
        




        
        // sort by weight by lambda expression

        Collections.sort(st,(o1,o2)->o1.getWeight()-o2.getWeight());

        System.out.println(st);


        Integer[] arr = {1,3,7,2,8,3,6,2,8,9};

        Arrays.sort(arr, new ArrCmp());

        for (int ele : arr) {
            
            System.err.println(ele);
        }

    }
}