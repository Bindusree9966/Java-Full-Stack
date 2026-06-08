//input:2,9,31,-4,21,7
//input:k=3
//output:48
//Explaination:2+9+31=42
//9+31+-4=36
//31+-1+21=48
//-4+21+7=24
//max in all is 48 so output is 48

class slidingwindow{
    public static void main(String[] args) {
        int[] a = {2, 9, 31, -4, 21, 7};
        int k=3;
        int wsum = 0;
        int maxsum = 0;
        for (int i = 0; i < k; i++)
        {
            wsum+=a[i];
        }
        for(int i=k;i<a.length;i++){
            wsum=wsum-a[i-k]+a[i];
            maxsum=Math.max(maxsum,wsum);
        }
        System.out.println(maxsum);
    }
}