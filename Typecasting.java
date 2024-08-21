import java.util.Scanner;

public class Typecasting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        int b = (int) a; // this is called type casting
        System.out.println(b);
        
    }
}