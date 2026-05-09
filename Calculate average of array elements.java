import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
     //Calculate average of array elements
        int[] number = {5,7,9,12,35,55,23,13};
        int sum = 0;
        for(int i =0;i<number.length;i++){
            sum+=number[i];
        }
        float average = (float) sum/number.length;
        System.out.println(average);

    }
}