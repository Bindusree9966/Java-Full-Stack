package collectionframeworks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(10);
        list.add("Gabbarsingh");
        list.add("Arya");
        list.add("vijetha");
        list.add("Athadu");
        list.add("Peddi");
        for(String s:list)
        {
            System.out.println(s);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list.set(1,"Eega"));
        System.out.println(list);
        System.out.println(list.contains("Peddi"));
        Object[] arr=list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
        //System.out.println(list);
    }
}
