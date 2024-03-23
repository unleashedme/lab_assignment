import java.util.*;
public class lab10_program3 {
    public static void main(String args[]){
        int arr[]=new int[5];
        try{
            Scanner sc= new Scanner(System.in);
            for(int i=0;i<5;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<4;i++){
                int c=arr[i]/arr[i+1];
                System.out.println(c);
            }
            System.out.println(arr[1]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index is out of bound");
        }
        catch(ArithmeticException e){
            System.out.println("can not divide by 0");
        }
    }
}
