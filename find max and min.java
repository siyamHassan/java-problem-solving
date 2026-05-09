import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //find max and min 
        int[] value={23,45,2,56,67,200,92,100};
        int max=0;
        int min = 1000;
        //find max
        for (int i = 0;i<value.length;i++){
            if (value[i]>max){
                max = value[i];
            }
        }
        System.out.println("the max value is "+max);
        //find min
        for (int j=0;j<value.length;j++){
            if (value[j]<min){
                min=value[j];
            }
        }
        System.out.println("the min value is "+min);
        //answer would be:
        //max=200
        //min=2

    }
}