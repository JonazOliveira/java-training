package recursividade;

public class Fatorial {
    public static int fatorial(int n) {

        // chad ternary operator
        return (n==0 || n==1) ? 1 : n * fatorial(n - 1);

        // basic if-else
        /*
        if(n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
        */
    }

    public static void main(String[] args) {
        System.out.println(fatorial(5));
        System.out.println(fatorial(10));
    }
}
