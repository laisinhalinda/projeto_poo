public class Principal {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(4, 0, 0);
        q.calcularArea();
        q.calcularPerimetro();
        q.imprimir();

        System.out.println();

        Retangulo r = new Retangulo(5, 3, 0, 0);
        r.calcularArea();
        r.calcularPerimetro();
        r.imprimir();

        System.out.println();

        Circulo c = new Circulo(2.5, 0, 0);
        c.calcularArea();
        c.calcularPerimetro();
        c.imprimir();
    }
}
