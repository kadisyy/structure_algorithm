package linear;


public class TestRecursive {
    public static void main(String[] args) {
        print(10);
    }

    //java.lang.StackOverflowError  栈溢出 方法调用都在存在栈内
    private static void print(int i) {
        if ( i > 0) {
            System.out.println(i);
            print(i - 1);
        }
    }
}
