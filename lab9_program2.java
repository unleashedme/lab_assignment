
import java.util.*;


public class lab9_program2 {
    public static void main(String args[]){
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements in arralist1");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            arr1.add(a);
        }
        System.out.println("enter the number of elements in arralist2");
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            arr2.add(a);
        }
        for(int i=0;i<n;i++){
            arr3.add(arr1.get(i));
        }
        for(int i=0;i<m;i++){
            arr3.add(arr2.get(i));
        }
        for(int i=0;i<arr3.size();i++){
            System.out.print(arr3.get(i)+" ");
        }
        System.out.println("enter the element");
        int k=sc.nextInt();
        int posn=0,flag=0;
        for(int j=0;j<arr3.size();j++){
            if(arr3.get(j)==k){
                posn=j;
                flag=1;
            }
        }
        if(flag==1){
            System.out.println(k+" is at "+posn);
        }
        else{
            System.out.println(k+" not found");
        }
        
    }
}
