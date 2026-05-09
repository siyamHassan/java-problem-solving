import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //Remove specific element from array
        int[] number = {2,45,23,21,10,56,33};
        int remove_item = 23;
        for (int j=2;j<number.length-1;j++){
            number[j]=number[j+1];
        }
        System.out.println(Arrays.toString(number));

    }
}