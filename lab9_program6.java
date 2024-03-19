import java.util.*;
public class lab9_program6 {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String str = s.next();
        char ch1[]=new char[str.length()];
        int n=str.length();
        int pos=0;
        for(int j=0;j<n;j++){
            ch1[j]=str.charAt(j);
        }
        for(int i=0;i<n;i++){
            if(ch1[i]!='0'){
                pos=i;
                break;
            }
        }
        char ch2[]=new char[n-pos];
        for(int j=0;j<ch2.length;j++){
            ch2[j]=ch1[pos+j];
        }
        str=String.valueOf(ch2);
        System.out.println(str);
    }
}
