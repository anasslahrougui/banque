import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compte {

    private double solde;

    private List<Operation> operations = new ArrayList<>();

    private static final Logger LOGGER = LoggerFactory.getLogger(Compte.class);

    public Compte(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    private boolean siSoldeSuffisant(double solde){
        if(this.solde >= solde){
            return true;
        }
        return false;
    }

    public void retrait(double montantOperation){
        if(siSoldeSuffisant(montantOperation)){
            double soldeEncours = this.solde -= montantOperation;
            Operation operation = enregisterOperation("retrait", montantOperation, soldeEncours);
            operations.add(operation);
        }else{
            System.out.println("Solde insuffisant !");
        }
    }

    public void deposer(double montantOperation){
        double soldeEncours = this.solde += montantOperation;
        Operation operation = enregisterOperation("depot", montantOperation, soldeEncours);
        operations.add(operation);
    }

    private Operation enregisterOperation(String typeOperation, double montantOperation, double soldeEncours) {
        Operation operation = new Operation();
        operation.setDateOperation(LocalDate.now());
        operation.setTypeOperation(typeOperation);
        operation.setMontantOperation(montantOperation);
        operation.setSoldeEnCours(soldeEncours);
        return operation;
    }

    public void historiqueOperation(Compte compte){
        System.out.println("Historique des opérations");
        compte.operations.forEach(operation -> System.out.println("Type d'operation : "+operation.getTypeOperation()+" \nDate de l'opération : "+operation.getDateOperation()+"\nMontant opération : "+operation.getMontantOperation()+" €\nSolde en cours: "+operation.getSoldeEnCours()+" €"));
    }

}
