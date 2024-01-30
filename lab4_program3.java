import java.util.Scanner;

class student{
    public int student_roll=0;                                                                                                         
    String student_name="unknown";
    int student_marks[] = {0,0,0,0,0};
    student(){
        System.out.println(student_name);
        System.out.println(student_roll);
        for(int i=0;i<5;i++){
            System.out.println(student_marks[i]);
        }
    }
    student(int student_roll,String student_name,int student_marks[]){
        System.out.println(student_name);
        System.out.println(student_roll);
        for(int i=0;i<5;i++){
            System.out.println(student_marks[i]);
        }
    }
}
public class lab4_program3 {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        student st1=new student();
        st1.student_roll=19;
        st1.student_name="abhinav";
        for(int i=0;i<5;i++){
            st1.student_marks[i]=s.nextInt();
        }
        
        int marks[]={90,97,98,96,40};
        student st2=new student(11,"harsh raj",marks);
    }
}
