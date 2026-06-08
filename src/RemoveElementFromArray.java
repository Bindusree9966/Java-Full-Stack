import java.util.Arrays;

class RemoveElementFromArray {
    public static void main(String[] args) {

        int[] a = {10,6,0,18,11,7,24,0,5};
        int t = 11;
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] == t) {
                for(int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
            }
        }

        for(int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}