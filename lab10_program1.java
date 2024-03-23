class test{
    void show(){
        System.out.println("in show");
    }
    public void finalize(){
        System.out.println("Garbage collected");
    }
}
public class lab10_program1 {
    
    public static void main(String args[]){
        try{
            test t1=new test();
            test t2=new test();
            //t1=t2;
            t1=null;
            t2=null;
            //t1.show();
            System.gc();
            System.runFinalization();
        }
        catch(Exception e){
            System.out.println("something went wrong "+e.getMessage());
        }
        finally{
                System.out.println("end of program");
                }
        
    }
}
