package Arrays;

public class maxmin {
    public static void main(String[] args) {
        int[] a = {8, 9, 4, 6, 89};
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);

    }
}
