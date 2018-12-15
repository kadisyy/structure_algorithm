package linear;


public class TestArray {
    public static void main(String[] args) {
        //数组初始化方式
        int[] input = {1, 2, 4, 5};
        int[] input1 = new int[]{2, 3, 5};

        //获取结果
        System.out.println("数组长度: " + input.length + "; 第二个结果是: " + input[1]);

        //赋值
        input[1] = 99;
        System.out.println("数组长度: " + input.length + "; 新的第二个结果是: " + input[1]);

        //遍历
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }


        //解决数组长度不可变
        int[] last = new int[10];
        System.arraycopy(input, 0, last, 0, input.length - 2);
        printf(last);
        //删除数组
        int pos = 2;
        int[] dest = new int[input.length - 1];
        for (int i = 0; i < input.length; i++) {
            if (i < pos) {
                dest[i] = input[i];
            } else {
                dest[i] = input[i + 1];
            }
            // else if (i > pos) {
            //                dest[i - 1] = input[i];
            //            } else {
            //                continue;
            //            }
        }
        printf(dest);
    }

    private static void printf(int[] in) {
        for (int i = 0; i < in.length; i++) {
            System.out.println("Value = " + in[i]);
        }
    }
}
