 interface Cyccle {
    int a= 8; // this is a final variable , its value cannot be changed
    void speed(int increment);
    void brake(int decrement);
}
interface Cyccles{
    void blowhorn1();
    void blowHorn2();
}
class avonCycle implements Cyccle , Cyccles{
    int speed = 7;
    public void speed(int increment){
speed =speed+increment;
        System.out.println(speed);
    }
    public void brake(int decrement){
speed = speed - decrement;
        System.out.println(speed);
    }
    public void blowhorn1(){
        System.out.println("bowhorn1 ");
    }
    public void blowHorn2(){
        System.out.println("blowhorn2 ");
    }
}
