public class Peca{
    private String nome;
    private double custo;
    private double lucro;
    
    public Peca(String nome, double custo, double lucro) {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    public Peca() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double calcularPreco(){
        return lucro+custo;
    }

    public void exibir(){
        System.out.println("========= Peça =========");
        System.out.println("Nome: " + nome);
        System.out.println("Custo: R$" + custo);
        System.out.println("Lucro: R$" + lucro);
        System.out.println("Preço: R$" + calcularPreco());
    }
}