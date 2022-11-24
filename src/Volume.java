public class Volume {
    int r , l,b ,h,a;
    void volume1 (int a ){
        System.out.println("volumne of cube is " + a*a*a);
    }
    void volume1 (int r ,int h){
        System.out.println("voulume of cylinder is" + (Math.PI * r *r *h));
    }
    void volume1 (int l,int b,int h){
        System.out.println("volume of cuboid is " + (l*b*h));
    }
}
