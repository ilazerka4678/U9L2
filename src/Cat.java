public class Cat extends Animal{
    boolean playedWith;
    public Cat (String n, int a, boolean v){
        super(n,a,v);
        playedWith = false;
    }
    public void play(){
        System.out.println("I have been played with! Hooray!");
        playedWith = true;
    }
    public boolean hasPlayedWith(){
        return playedWith;
    }



}
