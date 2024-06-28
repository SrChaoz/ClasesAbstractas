package ec.edu.puce.abstractas;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
