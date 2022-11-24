import java.util.Scanner;
class Book1 {
    String bname1;
    String authorname1;
    int pages1;
    static Scanner s = new Scanner(System.in);
    void inputs (){
        System.out.println("enter book details");
        bname1 = s.nextLine();
        authorname1 = s.nextLine();
        pages1 = s.nextInt();
    }
    void displays(){
        System.out.print("bookname =" +bname1);
        System.out.print("authorname ="+authorname1);
        System.out.println("pages="+pages1);
    }
}



public class Main {
//static Scanner ob = new Scanner(System.in);
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
       int n;
        System.out.println("enter value for n");
        n = s.nextInt();
        int a[] = new int[n];
        Evenodd e = new Evenodd();
      e.input(n,a);
      e.sum(n,a);
      e.display(n,a);

        /*  Volume v = new Volume();
        v.volume1(4);
        v.volume1(2,4);
        v.volume1(3,4,5);*/


       // Shape s1 = new Shape(3);
       // Shape s2 = new Shape(2.2f);
       // Shape s3 = new Shape(4,5);

        //Fibonacci f = new Fibonacci(8);
        //f.number();
        //Add a1 = new Add(10,20);
        //a1.sum();
       // a1.display();
      //Scanner  ob = new Scanner(System.in);
 /* int flag =0;
int j;
        String ename;
       Employeee e[] = new Employeee[10];
       for(int i=0;i<2;i++){
           e[i] = new Employeee();
           e[i].input();
       }
       for(int i=0;i<2;i++){
           e[i].display();
       }
        System.out.println("enter name of employee whose detail to be searched");
       ename = Book1.s.nextLine();
       for( j=0;j<2;j++) {
           if (ename.equals(e[j].name)) {
               flag = 1;
               break;
           }
       }
           if(flag==1){
               e[j].display();
           }
           else{
               System.out.println("employee detail not found");
           }
        System.out.println("details of employee with salary above 30000");
         for(int i =0;i<2;i++){
             if(e[i].basic>=30000){
                 e[i].display();
             }
         }
       */
        /* String bfound1;
        //Scanner s = new Scanner(System.in);
        Book1 bo[] = new Book1[10];
        for (int i = 0; i < 2; i++) {
            bo[i] = new Book1();
            bo[i].inputs();
        }
        for (int i = 0; i < 2; i++) {
            bo[i].displays();
        }

        System.out.println("enter book name to search");
        bfound1 = Book1.s.nextLine();
        for (int i = 0; i < 2; i++) {
            if (bfound1.equals(bo[i].bname1)) {
                bo[i].displays();
            }
        }*/
    }
}










