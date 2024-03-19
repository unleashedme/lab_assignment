import java.util.*;
public class lab9_program10 {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String str1=s.next();
        String str2=s.next();
        String str3;
        int n=str1.length(),m=str2.length();
        int flag1=0,flag2=0;
        for(int i=0;i<n/2;i++){
            if(str1.charAt(i)!=str1.charAt(n-i-1)){
                flag1=1;
                System.out.println("string 1 is not palindrome");
                break;
            }
        }
        if(flag1==0)
            System.out.println("string 1 is palindrome");
        for(int i=0;i<m/2;i++){
            if(str2.charAt(i)!=str2.charAt(m-i-1)){
                flag2=1;
                System.out.println("string 2 is not palindrome");
                break;
            }
        }
        if(flag2==0)
            System.out.println("string 2 is palindrome");
        str3=str1+str2;
        System.out.println(str3);
    }
}
