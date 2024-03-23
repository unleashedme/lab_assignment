class Employee{
    private String name;
    private int age;
    private int ID;
    private static int NextId=1;
    public static int total=0;
    Employee(String s,int n){
        this.name=s;
        this.age=n;
        this.ID=NextId++;
        total++;
    }
    void show(){
        System.out.println("name: "+name+" age: "+age+" ID: "+ID);
    }
    void showNextId(){
        System.out.println("Id of next employee is: "+(ID+1));
    }
    protected void finalize(){
       --NextId;
       total--;
    }
}
public class lab10_program2 {
    public static void main(String args[]){
        Employee a= new Employee("abhinav",19);
        Employee h= new Employee("harsh",11);
        a.show();
        a.showNextId();
        h.show();
        h.showNextId();
        {
            Employee af = new Employee("affan",07);
            Employee n = new Employee("nisha",05);
            af.show();
            af.showNextId();
            n.show();
            n.showNextId();
            System.out.println("total number of employee+intern is "+Employee.total);
            af= null;
            n=null;
            System.gc();
            System.runFinalization();
        }
        System.out.println("total number of employee is "+Employee.total);
    }
}
