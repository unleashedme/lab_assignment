import java.util.*;
public class lab9_program4 {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String str1=s.next();
        String str2=s.next();
        int flag=0;
        for(int i=0;i<str1.length();i++){
            flag=0;
            for(int j=0;j<str2.length();j++){
                if(str2.charAt(j)==str1.charAt(i)){
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        if(flag==1){
            System.out.println("anagram words");
        }
        else
            System.out.println("not anagram words");
    }
}
