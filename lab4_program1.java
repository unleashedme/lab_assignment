class employee{
    private int employee_id;
    private String employee_name;
    private String employee_department;
    void setEmployee_id(int n){
        employee_id=n;
    }
    int getEmployee_id(){
        return employee_id;
    }
    void setEmployee_name(String s){
        this.employee_name=s;
    }
    String getEmployee_name(){
        return employee_name;
    }
    void setEmployee_deprtment(String str){
        this.employee_department=str;
    }
    String getEmployee_department(){
        return employee_department;
    }

}
public class lab4_program1 {
    public static void main(String []args){
        employee harsh=new employee();
        harsh.setEmployee_id(11);
        int id1=harsh.getEmployee_id();
        System.out.println(id1);
        harsh.setEmployee_name("Harsh Raj");
        harsh.setEmployee_deprtment("mathematics");
        System.out.println(harsh.getEmployee_name());
        System.out.println(harsh.getEmployee_department());
    }
    
}
