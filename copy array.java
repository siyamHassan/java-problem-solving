import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //copy array
        int[] numbers={2,4,6,8,9};
        int[] copy = new int[numbers.length];
        for (int k=0;k<numbers.length;k++){
            copy[k]=numbers[k];
        }
        System.out.println(Arrays.toString(copy));

    }
}