import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
     //sum all value in array
        int sum=0;
        int[] number={2,43,54,7,98,23,12};
        for(int i=0;i<number.length;i++){
            sum+=number[i];
        }
        System.out.println("sum all value is "+sum);
    }
}