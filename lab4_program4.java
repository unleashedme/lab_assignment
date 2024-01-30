class student1{
    public int student_roll;                                                                                                         
    String student_name;
    int student_marks[]=new int[5];
    student1(int student_roll,String student_name,int student_marks[]){
        System.out.println("name:"+student_name);
        System.out.println("roll:"+student_roll);
        System.out.println("marks:");
        for(int i=0;i<5;i++){
            System.out.println(student_marks[i]);
        }
    }
    int sum=0;
    int av_mark(int student_marks[]){
        for(int i=0;i<5;i++){
            sum= sum+student_marks[i];
        }
        int average_mark=sum/5;
        return average_mark;
    }
}
public class lab4_program4 {
    public static void main(String []args){
        int marks1[]={10,15,20,25,30};
        student1 st1=new student1(11,"harsh",marks1);
        int marks2[]={35,40,45,50,55};
        student1 st2=new student1(16,"madhu",marks2);
        int marks3[]={60,65,70,75,80};
        student1 st3=new student1(5,"nisha",marks3);
        int Average_Mark=st1.av_mark(marks1);
        System.out.printf("average marks of %S is %d",st1.student_name,Average_Mark);
    }
    
}
