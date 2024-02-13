/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;

/**
 *
 * @author Admin
 */
class Student{
    String Student_name;
    int Student_roll,Student_fee;
    Student(){
        this("abhinav",19,12000);
    }
    Student(String Student_name,int Student_roll,int Student_fee){
        this.Student_name=Student_name;
        this.Student_roll=Student_roll;
        this.Student_fee=Student_fee;
    }
    void Display(){
        show(this);
        System.out.println("name: "+this.Student_name+" roll: "+this.Student_roll+" fee: "+this.Student_fee);
    }
    void show(Student s){
        System.out.println("show has been called");
    }
}
public class lab6_program2 {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter name of student");
        String name=sc.next();
        System.out.println("enter roll of student");
        int roll=sc.nextInt();
        System.out.println("enter fee");
        int fee=sc.nextInt();
        Student ws= new Student(name,roll,fee);
        ws.Display();
        Student s1= new Student();
        s1.Display();
    }
}
