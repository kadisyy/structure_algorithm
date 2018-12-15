package linear;


public class TestHannuotan {
    public static void main(String[] args) {
        haoni(2, 'A', 'B', 'C');
    }

    /**
     * 汉诺塔移动
     *
     * @param n    共有N个盘子
     * @param from 开始的
     * @param in   中间的
     * @param to   目标的
     */
    public static void haoni(int n, char from, char in, char to) {
        if (n == 1) {
            System.out.println("第1个盘子从" + from + "移动到" + to);
        } else {
            haoni(n - 1, from, to, in);
            System.out.println("第" + n + "个盘子从" + from + "移动到" + to);
            haoni(n - 1, in, from, to);
        }
    }
}
