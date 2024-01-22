
public class mainCirculo {
    public static void main(String[] args) {

        Circulo f1 = new Circulo(3.5);
        Cilindro f2 = new Cilindro(2.5,6.3);

        System.out.println("//Figura1//");
        System.out.println("Radio de la figura 1: " + f1.getRadio());
        System.out.println("Area de la figura 1: " + f1.getArea());
        System.out.println();
        System.out.println("//Figura2//");
        System.out.println("Radio de la figura 2: " + f2.getRadio());
        System.out.println("Altura de la figura 2: " + f2.getAltura());
        System.out.println("Area de la figura 2: " + f2.getArea());
        System.out.println("Volumen de la figura 2: " + f2.getVolume());
    }
}
