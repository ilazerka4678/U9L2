public class Enlisted extends MilitaryPersonnel{
    private boolean isNCO;
    public Enlisted(String rank, String name, int years, boolean NCO){
        super(rank, name, years);
        isNCO = NCO;
    }
    public void march(){
        System.out.println("I marched with the column.");
    }
    public void followOrder(){
        System.out.print("Yes, sir!");
    }
}
