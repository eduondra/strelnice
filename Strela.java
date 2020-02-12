import java.util.Scanner;
public class Strela{
    private String poziceVeze; 
    private int strela;
    Scanner sc = new Scanner(System.in);

    

    public  int usersStrela(){
        System.out.println("Zadej cislo pro dolet rakety");
        strela = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < strela; i++){
            System.out.print("> ");
        }
        return strela;
    }

   
    

   
    
}