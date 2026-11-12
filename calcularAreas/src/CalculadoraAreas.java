public class CalculadoraAreas {

    // Metodo para calcular a área de um quadrado
    public int calcularArea(int a) {
        return a * a;
    }

    // Metodo para calcular a área de um retângulo
    public float calcularArea(int a, int b) {
        return a * b;
    }

    // Metodo para calcular a área de um circulo
    public double calcularArea(double a) {
        return Math.PI * a * a;
    }
}