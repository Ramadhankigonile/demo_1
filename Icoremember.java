public class Icoremember {
    private String names;

   public String getName(){
    return names;
   }

   public void setName(String newName){
    this.names = newName;
   }
}

    class third {
        public static void main(String[] args) {
        Icoremember myobj = new Icoremember();
        myobj.setName("ABDI");
         System.out.println(myobj.getName());
   }

   }



