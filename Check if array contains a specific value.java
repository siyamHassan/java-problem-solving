import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
     //Check if array contains a specific value
        String[] fruits = {"apple","kiwi","Mango","papaya","banana"};
        String user_search;
        boolean is_have = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Is there have:");
        user_search = sc.next();
        for(String x:fruits){
            if (user_search.toLowerCase().equals(x.toLowerCase())){
                is_have = true;
                break;
            }
        }
        if (is_have){
            System.out.println("yes,there have");
        }else {
            System.out.printf("No");
        }
    }
}