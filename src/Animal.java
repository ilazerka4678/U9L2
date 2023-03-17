public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;

    public Animal (String n, int a, boolean v){
        name = n;
        age = a;
        vaccinated = v;
    }
    public void adopt(){
        System.out.println("I have been adopted! Huzzah!");
    }
    public void feed(){
        System.out.println("I have been fed! Scrumptious!");
    }

}
