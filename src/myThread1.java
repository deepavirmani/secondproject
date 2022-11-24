public class myThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<=5) {
            System.out.println("this is thread of thread1 class");
            i++;
        }
    }
}
 class myThread2 extends Thread{
    public void run(){
        System.out.println("this is thread of thread2 class");
    }
}
