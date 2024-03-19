import java.util.*;
public class lab9_program5 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str1= s.next();
        String str2;
        char ch[]=new char[str1.length()];
        for(int i=0;i<str1.length();i++){
            ch[i]=str1.charAt(str1.length()-i-1);
        }
        str2=String.valueOf(ch);
        System.out.println(str2);
    }
}
