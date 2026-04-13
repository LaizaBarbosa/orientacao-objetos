public class Loja {
    private String nomeLoja;
    private Brinquedo estoque[];

    public Loja(String nome, int qtde){
        this.nomeLoja = nome;
        estoque = new Brinquedo[qtde];
    }

    public void comprar(Brinquedo o, int posicao){
		if (posicao < estoque.length) {
            estoque[posicao] = o;
		}else{
            System.out.println("posição invalida");
        }
	}

    public void mostrar(){
        System.out.println("\n ---Brinquedos Lojas "+nomeLoja);
        for(int i=0; i<estoque.length;i++){
            if((estoque[i]!=null) && (estoque[i].getPreco()>0))
                 estoque[i].imprimir();    
            else
            {
                if((estoque[i]!=null) && (estoque[i].getPreco()<0))
                    System.out.println("VENDIDO");
            }
            
        }
    }
    
    public void vender(int posicao){
         if(posicao<estoque.length)
         {
             if(estoque[posicao]!=null)
                estoque[posicao].setPreco(-1);
         }    
         else
             System.out.println("Posicao invalida!");
    }

}
