public class Fibonacci {

    public static void main(String[] args) {

        int size = 1000;
        long[] fibo = new long[size];

        fibo[0] = 1;
        fibo[1] = 1;

        for(int i = 0, j = 1, k = 2; k < fibo.length; i++, j++, k++) {
            fibo[k] = fibo[i] + fibo[j];
        }

        for (long l : fibo) {
            System.out.print(l + "\t");
        }
    }

    public static long fib(int n) {
        if(n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static long fibonacci(int n) {
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}
