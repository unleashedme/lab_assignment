abstract class bike{
    abstract void run();
}
class honda extends bike{
    void run(){
        System.out.println("bike is running");
    }
}
public class lab8_program2 {
    public static void main(String args[]){
        bike b = new honda();
        b.run();
    }    
}