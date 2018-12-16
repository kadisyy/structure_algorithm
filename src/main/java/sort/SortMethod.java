package sort;

import java.util.Arrays;

public class SortMethod {
    private static int[] input = {2, 4, 10, 3, -9, 19, -2};

    public static void main(String[] args) {

        //BubbleSort(input);
        QuickSort(input,0, input.length - 1);
        show(input);
    }

    public static void BubbleSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {   //控制多少趟
            for (int j = 0; j < input.length - 1 - i; j++) {  //每一趟比较多少次数
                if (input[j] > input[j + 1]) {
                    int tmp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = tmp;
                }
            }
        }
    }

    public static void QuickSort(int[] input, int start, int end) {
        if (start <end) {
            int stard = input[start];
            int low = start;
            int high = end;
            while (low < high) {
                while (low < high && stard <= input[high]) {
                    high--;
                }
                input[low] = input[high];
                while (low < high && input[low] <= stard) {
                    low++;
                }
                input[high] = input[low];
            }
            input[low] = stard;

            //处理右边
            QuickSort(input, start, low);
            QuickSort(input, low + 1, end);
        }
    }

    public static void show(int[] input) {
        System.out.println(Arrays.toString(input));
    }
}
