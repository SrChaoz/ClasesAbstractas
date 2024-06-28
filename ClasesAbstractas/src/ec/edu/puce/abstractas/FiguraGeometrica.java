package ec.edu.puce.abstractas;

public abstract class FiguraGeometrica {
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();


    public boolean mayorQue(FiguraGeometrica figura2) {
        return this.calcularArea() > figura2.calcularArea();
    }


    @Override
    public String toString() {
        return this.nombre + " con área " + this.calcularArea();
    }
}