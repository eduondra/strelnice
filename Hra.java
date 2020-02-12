
class Hra{
    public static void main(String args[]){

        Uvod message = new Uvod();
        message.Uvod();
        
        for(int i=0; i < 5; i++) {
        
         Vez vzdalenost = new Vez();
         Vez generaceVzdalenosti = new Vez();
         Space mezera = new Space();
         Strela strelaUzivatele = new Strela();
            
            mezera.generateMezeru();
            vzdalenost.nahodneCislo();
            vzdalenost.spawnutiVez(generaceVzdalenosti.nahodneCislo());
            mezera.generateMezeru();
        
        
            CalculateShoot calculated = new CalculateShoot(strelaUzivatele.usersStrela(), generaceVzdalenosti.nahodneCislo());
            
            calculated.calculatedShoot();
        }
        

        }
        
    }
