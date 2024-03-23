
public class lab10_program5 {
    public static void main(String args[]){
        try{
            try{
                try{
                    int arr[]={1,2,3,4};
                    System.out.println(arr[5]);
                }
                catch(ArithmeticException e){
                    System.out.println(e.getMessage());
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("array index is out of bound");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
