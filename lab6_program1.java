/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Admin
 */
class student3{
    String Student_name;
    int Student_roll,Student_fee;
    student3(String Student_name,int Student_roll,int Student_fee){
        this.Student_name=Student_name;
        this.Student_roll=Student_roll;
        this.Student_fee=Student_fee;
    }
    void Display(){
        System.out.println("name: "+this.Student_name+" roll: "+this.Student_roll+" fee: "+this.Student_fee);
    }
}
public class lab6_program1 {
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter name of student");
        String name=s.next();
        System.out.println("enter roll of student");
        int roll=s.nextInt();
        System.out.println("enter fee");
        int fee=s.nextInt();
        student3 ws= new student3(name,roll,fee);
        ws.Display();
        System.out.println("enter name of student");
        String name2=s.next();
        System.out.println("enter roll of student");
        int roll2=s.nextInt();
        System.out.println("enter fee");
        int fee2=s.nextInt();
        student3 ws2= new student3(name2,roll2,fee2);
        ws2.Display();
    }
    
}


