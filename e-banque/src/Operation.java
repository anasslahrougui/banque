import java.time.LocalDate;

public class Operation {

    private LocalDate dateOperation;

    private String typeOperation;

    private double montantOperation;

    private double soldeEnCours;

    public LocalDate getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(LocalDate dateOperation) {
        this.dateOperation = dateOperation;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String nomOperation) {
        this.typeOperation = nomOperation;
    }

    public double getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(double montantOperation) {
        this.montantOperation = montantOperation;
    }

    public double getSoldeEnCours() {
        return soldeEnCours;
    }

    public void setSoldeEnCours(double soldeEnCours) {
        this.soldeEnCours = soldeEnCours;
    }
}
