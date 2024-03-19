
import java.util.ArrayList;
import java.util.Scanner;


public class lab9_program3 {
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
        int max=arr3.get(1);
        int min=arr3.get(1);
        for(int i=0;i<arr3.size();i++){
            if(arr3.get(i)>max)
                max=arr3.get(i);
            if(arr3.get(i)<min)
                min=arr3.get(i);
        }
        System.out.println("maximum element is: "+max);
        System.out.println("minimum element is: "+min);
        System.out.println("enter the element to be removed from arraylist");
        int l=sc.nextInt();
        arr3.remove(Integer.valueOf(l));
        for(int i=0;i<arr3.size();i++){
            System.out.print(arr3.get(i)+" ");
        }
    }
}
