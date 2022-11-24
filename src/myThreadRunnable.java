public class myThreadRunnable implements Runnable {
    public void run(){
        int i = 0;
        while(i<=8) {
            System.out.println("runnable -->1");
            i++;
        }
    }
}
class myThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<=10) {
            System.out.println("runnable--> 2");
            i++;
        }
    }
}