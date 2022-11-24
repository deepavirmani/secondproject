import java.util.Scanner;

public class Maxnumber {
    int arr[] = new int[5];
    int sum1 =0;
    Scanner s = new Scanner(System.in);
    void input (){
        System.out.println("enter 5 element for array");
        for(int i=0;i<5;i++){
            arr[i] = s.nextInt();
        }
    }
    void sum (){
        for(int i = 0;i<5;i++){
            sum1 = sum1 +arr[i];
        }
    }
    void display (){
        for(int i =0;i<5;i++){
            System.out.println("the array elements are "+arr[i]);
        }
        System.out.println("the sum of all elements are "+sum1);
    }

}
