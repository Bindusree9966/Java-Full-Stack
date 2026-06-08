class longword{
    public static void main(String[] args){
        String str="I love to code in java programming";
        String[] str1=str.split(" ");
        String word="";
        int max=0;
        for(int i=0;i<str1.length;i++){
            if(str1[i].length()>max){
                max=str1[i].length();
                word=str1[i];
            }
        }
        System.out.println(word);

    }
}