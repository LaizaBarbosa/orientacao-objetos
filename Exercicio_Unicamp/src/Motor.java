public class Motor extends Parte{
    private double potencia;
    private double corrente;
    private int rpm;
    
    public Motor(int cod, String nome, double valor, double potencia, double corrente, int rpm) {
        super(cod, nome, valor);
        this.potencia = potencia;
        this.corrente = corrente;
        this.rpm = rpm;
    }

    
}
