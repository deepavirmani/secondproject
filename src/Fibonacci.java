public class Fibonacci {
    int a;
    Fibonacci(int x ){
        a = x;

    }
    void number(){
        int c;
        int b = 1,n =0;
        System.out.println(n+" " +b);
        for(int i =0;i<a;i++) {
            c = b + n;
            n = b;
            b = c;
            System.out.println(c);
        }
    }
}
