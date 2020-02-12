
import java.util.*;
public class Vez
{
    private int hracipole;
    private int pole[] = new int[hracipole];

    
    
    public  int nahodneCislo(){
        hracipole = (int)((Math.random() * 49)+ 1);
        
        return hracipole;
    }

    

    public  int spawnutiVez(int hracipole){
        
        for(int i = 0; i < hracipole; i++){
            System.out.print(" ");
        }
        System.out.println("W");
        return hracipole;

        
       
    }
}
