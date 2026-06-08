import java.util.*;

class Rotate {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr[i].length; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
        for(int j = 0; j < arr[0].length; j++) {
            for(int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}