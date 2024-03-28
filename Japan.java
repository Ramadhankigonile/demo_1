public class Japan {
     public static void main(String[] args) {
        int mov = sum(15);
        System.out.println(mov);
     }

     public static int sum(int k){
        if (k>0) {
            return k + sum(k-1);
            }
        else{
            return 0;
        }    
     }
} 
