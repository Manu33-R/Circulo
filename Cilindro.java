public class Cilindro extends Circulo{

    private double altura;

    //Constructor

    public Cilindro(double radio, double altura) {
        super(radio);
        if (altura < 0)
            this.altura = 0;
        else
            this.altura = altura;
    }

    //Metodos


    @Override

    public double getArea(){
        return (super.getArea()*2)+(2*Math.PI*altura*getRadio());
    }

    public double getVolume(){
        return (altura*getArea());
    }

    //Getters y Setters

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
