package collectionframeworks;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class sets {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        LinkedHashSet<String> ls=new LinkedHashSet<>();
        hs.add("Bindu");
        hs.add("Hema");
        hs.add("Bhavya");
        hs.add("Deepa");
        hs.add("Dhanu");
        System.out.println(hs);
        hs.remove("Bhavya");
        System.out.println(hs);
        System.out.println(hs.contains("teju"));

        ls.add("teju");
        ls.add("pavani");
        ls.add("lekha");
        ls.add("navya");
        System.out.println(ls);
    }
}
