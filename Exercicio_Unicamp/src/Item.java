public class Item {
    private Parte parte;
    private int quantidade;
    
    public Item(Parte parte, int quantidade) {
        this.parte = parte;
        this.quantidade = quantidade;
    }

    public double calculaValor(){
        return parte.getValor() * quantidade;
    }

    @Override
    public String toString() {
        return "Item: parte=" + parte.getNome() + ", quantidade=" + quantidade + "\nValor: R$"+calculaValor();
    }

    
    
}
