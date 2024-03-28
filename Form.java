public class Form {
   public void formtype(){
    System.out.println("This form is accepted");
   } 
}

class student extends Form {
    public void formtype(){
        System.out.println("This form is for students");
    }
}

class teacher extends Form{
    public void formtype(){
        System.out.println("This is for teachers");
    }
}

class fourth{
    public static void main(String[] args) {
        Form myForm = new Form();
        Form myForm2 = new student();
        Form myForm3 = new teacher();
        myForm .formtype();
        myForm2 .formtype();
        myForm3 .formtype();
    }
}

