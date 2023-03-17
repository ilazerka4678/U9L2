public class Dog extends Animal {
    boolean walked;
    public Dog(String n, int a, boolean v) {
        super(n, a, v);
        walked = false;
    }
    public void walk(){
        System.out.println("I have been walked! Yay!");
        walked = true;
    }
    public boolean hasBeenWalked(){
        return walked;
    }

}
