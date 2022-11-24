

import java.util.Scanner;

public class Evenodd {
    int sumodd =0,sumeven=0;
    Scanner s = new Scanner(System.in);
    void input (int b ,int c[]){
        System.out.println("enter values");
        for(int i=0;i<b;i++){
            c[i] = s.nextInt();
        }
    }
    void sum (int b , int c[]){

        //int sumeven =0,sumodd=0;
        for(int i=0;i<b;i++){
            if (c[i] % 2 == 0) {
                sumeven = sumeven +c[i];
            }
            else{
                sumodd = sumodd +c[i];
            }
        }
    }
    void display(int b , int c[]){

        for(int i=0;i<b;i++){
            System.out.println("array elements are "+ c[i]);
        }
        System.out.println("sum of odd elements is "+ sumodd);
        System.out.println("sum of even elements is "+sumeven);
    }
}
