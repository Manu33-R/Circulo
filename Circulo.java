public class Circulo {
    private double radio;

    //Constructor

    public Circulo(double radio) {
        if (radio < 0)
            this.radio = 0;
        else
            this.radio = radio;
    }

    //Metodos
    public double getArea(){
        double area = (radio*radio*Math.PI);
        return area;
    }

    //Getters y Setters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
