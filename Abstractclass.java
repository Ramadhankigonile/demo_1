 abstract class Animal {
    public abstract void animalsound();
    public void sleep(){
        System.out.println("woooh");
    }
 }
    class Horse extends Animal{
        public void animalsound(){
            System.out.println("khuuuuh");
        }
    }



class fifth{
    public static void main(String[] args) {
       Horse myHorse = new Horse();
       
       myHorse .animalsound();
       myHorse .sleep();
       
        
    }
}
