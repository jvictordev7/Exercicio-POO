// src/Main.java
import formas.Circulo;
import formas.Retangulo;
import formas.FormaGeometrica;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo("Vermelho", 5.0);
        FormaGeometrica retangulo = new Retangulo("Azul", 4.0, 6.0);

        circulo.desenhar();
        System.out.println("Cor: " + circulo.getCor());
        System.out.println("Área do círculo: " + circulo.calcularArea());

        System.out.println();

        retangulo.desenhar();
        System.out.println("Cor: " + retangulo.getCor());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}
