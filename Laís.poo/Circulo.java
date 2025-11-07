public class Circulo {
    // Atributos da classe Circulo
    double raio;
    double area;
    double perimetro;
    double pi = 3.14;

    // Método Construtor
    Circulo(double raio, double area, double perimetro) {
        this.raio = raio;
        this.area = area;
        this.perimetro = perimetro;
    }

    // Método para calcular a área (π * r * r)
    void calcularArea() {
        this.area = pi * raio * raio;
    }

    // Método para calcular o perímetro (2 * π * r)
    void calcularPerimetro() {
        this.perimetro = 2 * pi * raio;
    }

    // Método para imprimir os resultados
    void imprimir() {
        System.out.println("Raio: " + this.raio);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}
