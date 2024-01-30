class car{
    private String brand="ford";
    String getcarBrand(){
        return brand;
    }
}
public class lab4_program2 {
    public static void main(String [] args){
        car c1 = new car();
        String brand=c1.getcarBrand();
        System.out.println(brand);
    }
    
}
