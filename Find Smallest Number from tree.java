import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static  void Find_Smallest_Number(){
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.print("Enter first number:");
        x = sc.nextInt();
        System.out.print("Enter second number:");
        y = sc.nextInt();
        System.out.print("Enter third number:");
        z = sc.nextInt();
        if ((x<y)&&(x<z)){
            System.out.println("the smallest value is "+x);
        } else if ((y<x)&&(y<z)) {
            System.out.println("the smallest value is "+y);
        }else {
            System.out.println("the smallest value is "+z);
        }
    }
    public static void main(String[] args){
    Find_Smallest_Number();

    }
}