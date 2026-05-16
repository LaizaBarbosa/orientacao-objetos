public class App {
    public static void main(String[] args) throws Exception {
        Peca p1 = new Peca("Chip", 500, 800);
        Peca p2 = new Peca("Processador", 900, 1200);

        System.out.println("========= Peças nacionais =========");
        p1.calcularPreco();
        p1.exibir();
        System.out.println("");
        
        p2.calcularPreco();
        p2.exibir();
        System.out.println("");
        
        System.out.println("========= Peças importadas =========");
        PecaImportada p3 = new PecaImportada("Placa mãe", 1000, 1000, 20, 15);

        p3.calcularPreco();
        p3.exibir();
        System.out.println("");
    }
}
