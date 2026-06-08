/*class common {

    public static void ele(int[] arr1, int[] arr2, int[] arr3) {

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                for(int k = 0; k < arr3.length; k++) {
                    if(arr1[i] == arr2[j] &&
                            arr2[j] == arr3[k]) {
                        System.out.print(arr1[i] + " ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,4,6,8,10};
        int[] arr3 = {2,3,6,9,12};
        ele(arr1, arr2, arr3);
    }
}*/

class common {
    public static void ele(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] &&
                    arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr2[j] < arr3[k]) {
                j++;
            }
            else {
                k++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr3 = {2, 3, 6, 9, 12};
        ele(arr1, arr2, arr3);
    }
}


