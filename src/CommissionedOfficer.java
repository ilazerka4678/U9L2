public class CommissionedOfficer extends MilitaryPersonnel {
    int menUnderCommand;

    public CommissionedOfficer(String rank, String name, int years, int menUnderCommand) {
        super(rank, name, years);
        this.menUnderCommand = menUnderCommand;
    }

    public void issueOrder() {
        int choice = (int) (Math.random() * 5);
        if (choice == 0) {
            System.out.println("At the ready!");
        }
        if (choice == 1){
            System.out.println("At the double quick! Forward march!");
        }
        if (choice == 2){
            System.out.println("Quiet in the ranks!");
        }
        if (choice == 3){
            System.out.println("Present arms!");
        }
        if (choice == 4){
            System.out.println("Center face!");
        }
    }
}
