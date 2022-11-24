import java.util.Scanner;
public class Employeee {
    String name;
    int basic , hra , da , conv , total;
    Scanner s = new Scanner(System.in);
    void input (){
        System.out.println("enter employee name and basic salary");
        name = s.nextLine();
        basic = s.nextInt();
    }
    void display(){
        hra = (int) (basic * 0.20);
        da = (int) (basic *0.15);
        conv =(int)(basic * 0.10);
        total = hra +da +conv +basic;
        System.out.println("employee details are:name = "+name + "basic= " +basic+ "hra=" +hra+ " da="+da+" conv"+ conv+ " total= "+total);
        System.out.println();
    }

}
