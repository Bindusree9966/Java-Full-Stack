package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students
{
    int roll;
    String name;

    public Students(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

}
public class com {
    public static void main(String[] args) {
        ArrayList<Students> list=new ArrayList<>();
        list.add(new Students(10,"A"));
        list.add(new Students(5,"B"));
        list.add(new Students(2,"C"));
        list.add(new Students(11,"D"));
        list.add(new Students(3,"E"));

        Comparator<Students> com=new Comparator<Students>() {
            @Override
            public int compare(Students a, Students b) {
                if(a.roll>b.roll){
                return 1;
                }
                return -1;
            }
        };
        Collections.sort(list,com);
        for(Students s:list)
        {
            System.out.println(s.name+" "+s.roll);
        }

    }
}
