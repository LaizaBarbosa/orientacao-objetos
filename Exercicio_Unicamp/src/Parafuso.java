public class Parafuso extends Parte{
    private double comprimento;
    private double diametro;

    public Parafuso(int cod, String nome, double valor, double comprimento, double diametro) {
        super(cod, nome, valor);
        this.comprimento = comprimento;
        this.diametro = diametro;
    }
    
    
}
