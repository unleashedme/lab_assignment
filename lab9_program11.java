import java.util.*;
public class lab9_program11 {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String str = s.next();
        String str1 = s.next();
        String str2 = s.next();
        System.out.println(str.endsWith(str2));
        System.out.println(str1.endsWith(str2));
    }
}
