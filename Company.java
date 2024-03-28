public class Company {
    protected String brand = "GUCCI";
    public void san(){
        System.out.println("MOST FAVORITE AND FAMOUS");
    }
}
    class clothes extends Company{
    private String modelname = "trouser";
    public static void main(String[] args) {
        clothes myobj = new clothes();
        myobj.san();
        System.out.println(myobj.brand + " " + myobj.modelname);
    }

    }


