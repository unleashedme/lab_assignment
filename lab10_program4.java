
public class lab10_program4 {
    public static void method1(int age){
        if(age<0)
            throw new IllegalArgumentException("age can not be less than 0");
        System.out.println("age is :"+age);
    }  
    public static void main(String args[]){
        try{
            method1(15);
        }
        catch(IllegalArgumentException e){
            System.out.println("age is less than 0");
        }
    }
}
