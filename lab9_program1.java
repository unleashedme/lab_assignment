import java.util.*;
public class lab9_program1 {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no. of elements to be added");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            arr.add(a);
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println("enter the element to be added at first position");
        int k= sc.nextInt();
        arr.add(1, k);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println("enter the element to be removed from arraylist");
        int l=sc.nextInt();
        arr.remove(Integer.valueOf(l));
        for(int i=0;i<arr.size()-1;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
