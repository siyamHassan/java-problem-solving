import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
     //Find index of an element in array
        int[] age = {21,12,33,45,23,36,26,39,44,56,34};
        int user_input = 33; //find index of 33
        for(int i = 1;i<=age.length;i++){
            if(age[i-1]==user_input){
                System.out.println("index is "+(i-1));//ans would be 2
            }

        }

    }
}