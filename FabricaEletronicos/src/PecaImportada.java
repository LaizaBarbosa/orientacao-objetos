public class PecaImportada extends Peca{
    private double taxaImportacao;
    private double taxaFrete;


    public PecaImportada(String nome, double custo, double lucro, double taxaImportacao, double taxaFrete) {
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    public PecaImportada() {
       
    }


    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public double getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(double taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    @Override
    public double calcularPreco() {
        double precoBase = super.calcularPreco();
        double valorImportacao = precoBase * (taxaImportacao / 100);
        double valorFrete = precoBase * (taxaFrete / 100);

        return precoBase + valorFrete + valorImportacao;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Taxa de frete: " + taxaFrete + "%");
        System.out.println("Taxa de importação: " + taxaImportacao + "%");
        System.out.println("Preço final: R$" + calcularPreco());
    }
}
