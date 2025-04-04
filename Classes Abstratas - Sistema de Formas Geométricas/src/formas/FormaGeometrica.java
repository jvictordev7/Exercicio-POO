// src/formas/FormaGeometrica.java
package formas;

public abstract class FormaGeometrica {
    protected String cor;
    protected double area;

    public FormaGeometrica(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public abstract double calcularArea();
    public abstract void desenhar();
}
