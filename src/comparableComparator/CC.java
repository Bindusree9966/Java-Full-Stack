package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CC {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(45);
        a.add(2);
        a.add(89);
        a.add(56);
        a.add(17);

//        Comparator<Integer> com=new Comparator<Integer>()
//        {
//           public int compare(Integer a,Integer b)
//            {
//                if(a%10 > b%10)
//                {
//                    return 1;
//                }
//                return -1;
//            }
//        };

        Comparator<Integer> com=( c, b)-> c%10 >b%10?1:-1;

        Collections.sort(a,com);
        System.out.println(a);
    }
}
