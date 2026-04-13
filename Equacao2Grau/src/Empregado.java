public class Empregado {
    private String nome, sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal < 0 ? 0.0 : salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal < 0 ? 0.0 : salarioMensal;
    }

    public void calcularSalarioAnual(){
        double salarioAnual = salarioMensal * 12;
        System.out.println("Salario anual do funcionário "+ nome + ": R$" + salarioAnual);
    }

    public void darAumento(double porcentagem){
        setSalarioMensal((salarioMensal * porcentagem) + salarioMensal);
    }
}
