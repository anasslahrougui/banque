
public class BanqueMain {

    public static void main(String args[]){

        Compte compte = new Compte(1000.00);
        Compte compte2 = new Compte(3000.00);

        compte.retrait(340.00);
        compte2.retrait(900.00);

        compte.deposer(100);
        compte.deposer(200);
        compte2.deposer(50);

        compte.historiqueOperation(compte);
    }
}
