package sort;

import java.util.Arrays;

/**
 * Created by 媛媛 on 2018/12/15.
 */
public class SortMethod {
    private static int[] input = {2, 4, 10, 3, -9, 19, -2};

    public static void main(String[] args) {

        BubbleSort(input);
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

    public static void show(int[] input) {
        System.out.println(Arrays.toString(input));
    }
}
