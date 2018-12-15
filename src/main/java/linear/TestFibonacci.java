package linear;

public class TestFibonacci {
    // f(1) = f(2) = 1, f(n) = f(n-1) + f(n-2)
    public static void main(String[] args) {
        System.out.println(test(3));
    }

    private static int test(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return test(i - 1) + test(i - 2);
        }
    }
}
