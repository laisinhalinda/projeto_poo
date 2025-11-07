public class Retangulo {
    // Atributos da classe Retangulo
    double base;
    double altura;
    double area;
    double perimetro;

    // Método Construtor
    Retangulo(double base, double altura, double area, double perimetro) {
        this.base = base;
        this.altura = altura;
        this.area = area;
        this.perimetro = perimetro;
    }

    // Método para calcular a área
    void calcularArea() {
        this.area = base * altura;
    }

    // Método para calcular o perímetro
    void calcularPerimetro() {
        this.perimetro = 2 * (base + altura);
    }

    // Método para imprimir os resultados
    void imprimir() {
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}