package Generics.Basics;


public class Main {
    public static void main(String[] args) {
        content<String> c=new content<>();
        c.setName("Bindu");
        System.out.println(c.getName());

        items<String,Double,Boolean> i=new items("Banana",10.3,true);
        System.out.println(i.getName() + " "+i.getD() + " "+i.getB());

    }
}
