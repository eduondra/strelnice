public class CalculateShoot{
    private int shoot;
    private int pc;
    private int human;
    private int hracipole;

    public CalculateShoot(int shoot, int hracipole){
        this.shoot = shoot;
        this.hracipole = hracipole;
    }

    public  void calculatedShoot(){
        
        if(shoot == hracipole){
            System.out.println("Dobra strela!");
            human = human + 1;
            System.out.println("Aktualní stav..... " + "human :" + human + " vs pc :" + pc);
        
        }else{
            System.out.println("Netrefil jsi se!");
            pc = pc + 1;
            System.out.println("Aktualní stav..... " + "human :" + human + " vs pc :" + pc);
        }
    
    }

    
}
