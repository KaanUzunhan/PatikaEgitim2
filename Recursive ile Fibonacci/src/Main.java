public class Main {
    static int Fibonacci(int sira) {
        if ( sira == 1 || sira == 2 ) return 1;

        return Fibonacci(sira-1) + Fibonacci(sira-2);
    }
    public static void main(String[] args) {
        int a = Fibonacci(9);

        System.out.println(a);


        }
    }
