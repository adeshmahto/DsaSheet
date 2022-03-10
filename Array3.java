import java.lang.reflect.Array;
import java.util.Arrays;

public class Array3
{
    public static void main(String[] args) {

        int arr[]={1,3,7,0,3};
        int k=3;
       System.out.println(ksort(arr,k));



    }
    public  static  int ksort(int arr[],int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

}
