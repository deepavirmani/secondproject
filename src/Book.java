import java.util.Scanner;
public class Book {
    String bname;
    String authorname;
    int pages;
    static Scanner s = new  Scanner(System.in);
    void input (){
        System.out.println("enter book name , authorname ,pages");
            bname = s.nextLine();
            authorname = s.nextLine();
            pages = s.nextInt();
    }

void display (){

        System.out.print("bookname " +bname +" "+ authorname+" "+ pages);

    System.out.println();
}

    public static void main(String[] args) {
        String bfound1;
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
        bfound1 = s.nextLine();
        for (int i = 0; i < 2; i++) {
            if (bfound1.equals(bo[i].bname1)) {
                bo[i].displays();
            }
        }
    }

}