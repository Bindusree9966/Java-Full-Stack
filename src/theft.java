public class theft {


    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 8, 5, 1, 0, 2, 8};
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + ",");
        }
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + ",");
        }
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i]);
            if (i < arr.length - 2) {
                System.out.print(",");
            }
        }
    }
}
