public class Encode {
    public static void main(String[] args) {
        int tomy =sum (3,19);
        System.out.println(tomy);
    }
    public static int sum(int start, int end){
        if (end>start) {
            return end + sum( start,end-1);
            
        }
        else{
            return end;
        }
    }
    
}
