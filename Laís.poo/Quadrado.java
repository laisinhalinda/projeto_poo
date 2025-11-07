
public class Quadrado {
    // Atributos da classe Quadrado
    double lado;
    double area;
    double perimetro;

    // Método Construtor
    Quadrado(double lado, double area, double perimetro) {
        this.lado = lado;
        this.area = area;
        this.perimetro = perimetro;
    }

    // Método para calcular a área (lado * lado)
    void calcularArea() {
        this.area = lado * lado;
    }

    // Método para calcular o perímetro (4 * lado)
    void calcularPerimetro() {
        this.perimetro = 4 * lado;
    }

    // Método para imprimir os resultados
    void imprimir() {
        System.out.println("Lado: " + this.lado);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}