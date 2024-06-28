package ec.edu.puce.abstractas;

public class Main {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo("Rectángulo 1");
        r1.setBase(7);
        r1.setAltura(15);
        System.out.println(r1);

        Rectangulo r2 = new Rectangulo("Rectángulo 2");
        r2.setBase(80);
        r2.setAltura(10);
        System.out.println(r2);


        if (r1.mayorQue(r2))
            System.out.println("El mayor es: " + r1);
        else
            System.out.println("El mayor es: " + r2);


        Triangulo t1 = new Triangulo("Triángulo 1");
        t1.setBase(10);
        t1.setAltura(20);
        System.out.println(t1);

        Triangulo t2 = new Triangulo("Triángulo 2");
        t2.setBase(5);
        t2.setAltura(15);
        System.out.println(t2);

        
        if (t1.mayorQue(t2))
            System.out.println("El mayor es: " + t1);
        else
            System.out.println("El mayor es: " + t2);


        Circulo c1 = new Circulo("Círculo 1");
        c1.setRadio(7);
        System.out.println(c1);

        Circulo c2 = new Circulo("Círculo 2");
        c2.setRadio(10);
        System.out.println(c2);


        if (c1.mayorQue(c2))
            System.out.println("El mayor es: " + c1);
        else
            System.out.println("El mayor es: " + c2);
    }
}
