class meraException extends Exception{
    meraException(String s){
        super(s);
    }
}
public class lab10_program7 {
    public static void validate(int age) throws meraException{
        if(age<0)
            throw new meraException("age is not valid");
        else
            System.out.println("age is valid");
    }
    public static void main(String args[]){
        try{
            validate(-2);
        }
        catch(meraException e){
            System.out.println(e.getMessage());
        }
    }
}
