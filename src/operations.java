public class operations{
    public static void main(String[] args){
        String str="1C0C1C1A1B1";
        int result=str.charAt(0)-'0';
        for(int i=1;i<str.length();i+=2){
            int value=str.charAt(i+1)-'0';
            char ch=str.charAt(i);
            if(ch=='C'){
                result=result^value;
            }
            else if(ch=='B'){
                result=result|value;
            }
            else if(ch=='A'){
                result=result&value;
            }
        }
        System.out.println(result);
    }
}