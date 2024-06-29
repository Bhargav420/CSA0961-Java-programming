class F implements Runnable {
    private int n;
    public F(int a) {
        n = a;
    }
    public void run() {
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
public class RFS {
    public static void main(String[] args) {
        int n = 5;
        Thread t = new Thread(new F(n));
        t.start();
    }
}