class Person{
    String name;
    int age;
    Person(String s,int a){
        name=s;
        age =a;
    }
    void Display(){
        System.out.println("name: "+name+" age: "+age);
    }
}
class student extends Person{
    int roll;
    int marks;
    student(String s,int a,int r,int m){
        super(s,a);
        name=s;
        age =a;
        roll=r;
        marks=m;
    }
    void Display(){
        marks=90;
        System.out.println("name: "+name+" age: "+age+" roll: "+roll+" marks: "+marks);
        System.out.println(this.marks);
    }
}
class employee extends Person{
    int salary;
    employee(String s,int a,int sl){
        super(s,a);
        name= s;
        age =a;
        salary = sl;
    }
    void Display(){
        System.out.println("name: "+name+" age: "+age+" salary: "+salary);
    }
}
public class lab7_program6 {
    public static void main(String args[]){
        Person p1 = new Person("piyush",22);
        p1.Display();
        Person s = new student("harsh",18,11,50000);
        s.Display();
        
    }
    
    
}
