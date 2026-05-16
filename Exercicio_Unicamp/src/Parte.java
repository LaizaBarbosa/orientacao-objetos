public abstract class Parte {
    private int cod;
    private String nome;
    private double valor;
    
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public Parte(int cod, String nome, double valor) {
        this.cod = cod;
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Parte -> cod=" + cod + ", nome=" + nome + ", valor=" + valor;
    }

    public double calculaValor(){
        return valor;
    }
    
}
