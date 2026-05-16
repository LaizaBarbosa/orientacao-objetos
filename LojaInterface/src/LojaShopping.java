public class LojaShopping extends Loja implements Registro{
    private String gerente;
    private String endereco;

    public LojaShopping(String razaoSocial, String gerente, String endereco) {
        super(razaoSocial);
        this.gerente = gerente;
        this.endereco = endereco;
    }

    public void mostrar(){
        System.out.println("=========== Loja Shopping ===========");
        System.out.println("Razão social: "+ razaoSocial);
        System.out.println("Situação: "+ mostrarRegistro());
        System.out.println("Endereço: "+ gerente);
        System.out.println("Gerente: "+ endereco);
        System.out.println();
    }

    public String mostrarRegistro(){
        String msg = !situacao ? "Fechada" : "Aberta";
        return msg;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void registraAberturaDia() {
        situacao = true;
    }

    @Override
    public void registraFechamentoDia() {
        situacao = false;
    }
}
