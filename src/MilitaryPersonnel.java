public class MilitaryPersonnel {
    String rank;
    String name;
    int yearsOfService;
    public MilitaryPersonnel(String rank, String name, int yearsOfService){
        this.rank = rank;
        this.name = name;
        this.yearsOfService = yearsOfService;
    }
    public void serveForAYear(){
        yearsOfService++;
    }
}
