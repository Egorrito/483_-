package l_3;

public class z_4 {

    public static final Double G=9.8;
    public static double vis(double h){
        double t= Math.sqrt(2*h/G);
        return t;
    }
    public static void main(String[] args) {
        System.out.println(vis(10));
    }
    
}