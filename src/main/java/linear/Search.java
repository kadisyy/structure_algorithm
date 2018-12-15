package linear;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] input = {1, 21, 13, 4, 25, 16, 7, 18, 9, 120};

       // System.out.println(binarySearchTool(9,input));
        System.out.println(linnerSearchTool(9,input));

    }

    private static int linnerSearchTool(int value, int[] input){
        int index = 0;
        for(int i=0; i < input.length; i++){
            if (input[i] == value){
                index = i;
                break;
            }
        }
        return  index;
    }
    //二分查找 目标数组有序
    private static int binarySearchTool(int value, int[] input) {
        Arrays.sort(input);
        System.out.println("排序好的数组: " + Arrays.toString(input));
        int begin = 0;
        int end = input.length;
        int mid = (begin + end) / 2;

        while (begin <= end) {
            if (value == input[mid]) {
                return mid;
            }
            if (value > input[mid]) {
                begin = mid + 1;
            } else if (value < input[mid]) {
                end = mid - 1;
            }
            mid = (begin + end) / 2;
        }
        return -1;
    }
}
