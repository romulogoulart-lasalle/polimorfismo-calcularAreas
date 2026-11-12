public class Programa {
    public static void main(String[] args) {
        CalculadoraAreas calc = new CalculadoraAreas();
        System.out.println(calc.calcularArea(2));       // metodo de calcular o quadrado
        System.out.println(calc.calcularArea(2, 3));    // metodo de calcular o retângulo
        System.out.println(calc.calcularArea(2.5));   // metodo de calcular o círculo

    }
}