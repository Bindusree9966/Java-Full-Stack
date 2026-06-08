import java.util.Arrays;
import java.util.Scanner;

class twodarray {
    public static void twod() {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));
        rowSum(arr);
        add(arr);
        mainDiagonal(arr);
        secondaryDiagonal(arr);
    }
    public static void rowSum(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " Sum = " + sum);
        }
    }
    public static void add(int[][] arr)
    {
        int sum=0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
    public static void mainDiagonal(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");

        }
        System.out.println();
    }
    public static void secondaryDiagonal(int[][] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i][n - 1 - i] + " ");
        }
    }

    public static void main(String[] args) {
        twod();
    }
}
