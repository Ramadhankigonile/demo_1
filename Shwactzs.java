abstract class Shwactzs {
    public String fname = "rama";
    public int age = 34;
    public abstract void study();
   
     }
     class Schoolar extends Shwactzs{
        public int examinationdate = 2024;
        public void study(){
        System.out.println("STUDYING ALL THE DAY");
    }
    }
    class second{
        public static void main(String[]args){
            Schoolar myobj = new Schoolar();
            System.out.println("Name: " + myobj.fname);
            System.out.println("Age: " + myobj.age);
            System.out.println("Examinationdate: " + myobj.examinationdate);
            myobj.study();
        }
    }
