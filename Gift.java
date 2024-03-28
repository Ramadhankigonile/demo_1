public class Gift {
static int mymethodint(int x, int y){
    return x+ y;
}
static double mymethoddouble(double x,double y){
  return x+ y;
}

public static void main(String[] args) {
    int z =mymethodint(4,  5);
    double t = mymethoddouble(4.5,3.24);
    System.out.println((z));
    System.out.println((t));
}

}
