package funcionarios;

public class Vendedor extends Funcionarios  {

    private EquipeVenda equipe;

    public float getSalario;

    public Vendedor() {
        
    }

    public EquipeVenda getEquipe() {
        return equipe;
    }

    public void setEquipe(EquipeVenda equipe) {
        this.equipe = equipe;
    }

    public float getGetSalario() {
        return getSalario;
    }

    public void setGetSalario(float getSalario) {
        this.getSalario = getSalario;
    }

    
}