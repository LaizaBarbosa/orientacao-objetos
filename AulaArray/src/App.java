public class App {
    public static void main(String[] args) throws Exception {
        
        Brinquedo oX = new Brinquedo("Comandos em acao", 89);
        Brinquedo oX1 = new Brinquedo("Barbie", 112.9);
        
        Loja oL0= new Loja("Hi Happy", 4);
        oL0.comprar(oX, 1);
        oL0.comprar(new Brinquedo("He Man", 130), 2);
        oL0.comprar(new Brinquedo("Hot Wills", 100), 0);
        oL0.comprar(oX1, 3);
        oL0.mostrar();
        
        //Primeira venda
        oL0.vender(1);
        oL0.mostrar();
        
        //Segunda venda
        oL0.vender(2);
        oL0.vender(3);
        oL0.mostrar();
        
        //Terceira venda
        oL0.vender(0);
        oL0.mostrar();
    }
}
