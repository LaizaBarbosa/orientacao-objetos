public class App {
    public static void main(String[] args) throws Exception {
        Parafuso p1 = new Parafuso(01, "Parafuso", 1.00, 0.10, 0.05);
        Motor m1 = new Motor(02, "Motor", 200, 100, 150, 210);

        Item i1 = new Item(m1, 20);
        Item i2 = new Item(p1, 10);

        i1.calculaValor();
        System.out.println(i1.toString());

        System.out.println();

        i2.calculaValor();
        System.out.println(i2.toString());

        System.out.println(p1.toString());
    }


}
