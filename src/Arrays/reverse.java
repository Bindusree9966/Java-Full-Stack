package Arrays;
//Backward Traversal
//public class reverse {
//    public static void main(String[] args) {
//        int[] a={1,2,3,4,5,6};
//        for(int i=a.length-1;i>=0;i--)
//        {
//            System.out.print(a[i]+ " ");
//        }
//    }
//}

//Two pointer Approach



public class reverse {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};

        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}

