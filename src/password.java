class password {

    static int CheckPassword(String str) {
        if(str.length() < 4)
            return 0;
        if(Character.isDigit(str.charAt(0)))
            return 0;
        boolean capital = false;
        boolean digit = false;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' ' || ch == '/')
                return 0;
            if(Character.isUpperCase(ch))
                capital = true;
            if(Character.isDigit(ch))
                digit = true;
        }
        if(capital && digit)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        String str = "aA1_67";
        System.out.println(CheckPassword(str));
    }
}