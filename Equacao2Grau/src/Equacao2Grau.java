public class Equacao2Grau {
    private double a,b,c,delta,x1,x2;

    public Equacao2Grau(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Equacao2Grau(){}

    public double getA() {return a;}

    public double getB() {return b;}

    public double getC() {return c;}

    public double getDelta() {
        return delta;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public void setA(double a) {this.a = a;}

    public void setB(double b) {this.b = b;}

    public void setC(double c) {this.c = c;}

    public void calcularDelta(){
        delta = Math.pow(b, 2) - 4 * a * c;
    }

    public void calcularRaiz(){
        calcularDelta();
        
        String msg = "";
        
        if (delta <= 0) {
            msg = "O delta não pode ser igual a zero";
        }else{
            x1 = (b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            msg = "x1 = " + x1 + "\nx2 = "+ x2;
        }

        System.out.println(msg);
    }

}
