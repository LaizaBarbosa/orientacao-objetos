public class App {
    public static void main(String[] args) throws Exception {
        // Equacao2Grau e1 = new Equacao2Grau(10, -30, -40);

        // e1.calcularRaiz();

        Empregado em1 = new Empregado("Osvaldo", "Cruz", 1000);        
        Empregado em2 = new Empregado("Josefina", "Pipi", 1500);
        
        em1.calcularSalarioAnual();
        em2.calcularSalarioAnual();
        
        em1.darAumento(0.1);
        em2.darAumento(0.1);

        System.out.println("");
        System.out.println("Salários após aumento de 10%: ");
        
        em1.calcularSalarioAnual();
        em2.calcularSalarioAnual();

        em1.setSalarioMensal(-100);
        System.out.println(em1.getSalarioMensal());
    }
}
