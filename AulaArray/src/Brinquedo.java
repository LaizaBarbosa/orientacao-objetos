public class Brinquedo {
    private String nome;
	private double preco;
	
	public Brinquedo(String nome,double preco) {
		this.nome=nome;
		this.preco=preco;
	}
	
	public void imprimir() {
		System.out.println("Nome: "+nome+" Preco: "+preco);
	}

	public void setPreco(double preco){
        this.preco = preco;
    }
	
    public double getPreco() {return this.preco;}
    
}
