import java.util.Scanner;

public class Add {
    int a , b ,c;
    Scanner s = new Scanner(System.in);
    Add(int x,int y){
        a=x;
        b=y;
    }
    void sum(){
        c = a+b;
    }
    void display(){
        System.out.println("addition is "+c);
    }
}
