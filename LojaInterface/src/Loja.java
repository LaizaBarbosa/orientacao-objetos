public abstract class Loja {
    protected int id;
    protected String razaoSocial;
    protected boolean situacao;
    private static int cont = 1;
    
    public Loja(String razaoSocial) {
        this.id = cont++;
        this.razaoSocial = razaoSocial;
        this.situacao = false;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public int getId() {
        return id;
    }

    
}
