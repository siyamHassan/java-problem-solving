import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
    //sort numberic
        int[] number = {23,1,45,3,6,7,32,90,22};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        //string sort
        String[] name = {"jon","arifa","bobi","korim","ridoy"};
        System.out.println("before:");
        System.out.println(Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("After:");
        System.out.println(Arrays.toString(name));
    }
}