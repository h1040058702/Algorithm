import java.util.Arrays;
//第一题
public class ArraySortAndPrint {
    public static void main(String[] args) {

        int[] arr = {30, 10, 50, 20, 40};

        Arrays.sort(arr);

        for (int num : arr) {
            System.out.println(num);
        }
    }
}

