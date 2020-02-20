package primitivos;

import java.util.ArrayList;

public class Triangulos extends Figuras {
    private double ladoa;
    private double ladob;
    private double ladoc;
    private double anguloa;
    private double angulob;
    private double anguloc;

    Triangulos(String nombre,double ladoa,double ladob,double ladoc){
        super(nombre);
        this.ladoa=ladoa;
        this.ladob=ladob;
        this.ladoc=ladoc;
        this.cordenadas=new ArrayList<Puntos>();
        this._es_valido=this.ValidarTriangulo();


        this.anguloa=0;
        this.angulob=0;
        this.anguloc=0;
    }

    private boolean ValidarTriangulo(){
        return ((this.ladoa+this.angulob>this.ladoc)&&(this.ladob+this.ladoc>this.ladoa)&&this.ladoa+this.ladoc>this.ladob);

    }

    public void CalcularAngulos(){
        double Anguloa=(Math.pow(this.ladoa,2)) - Math.pow(ladob,2) - Math.pow(ladoc,2)/(-2*this.ladob*this.ladoc);
        this.anguloa=Math.acos(Anguloa * (180/Math.PI));
        System.out.println("Angulo A"+this.anguloa);

        double Angulob=(Math.pow(this.ladob,2)) - Math.pow(ladoc,2) - Math.pow(ladoa,2)/(-2*this.ladoa*this.ladoc);
        this.angulob=Math.acos(Angulob * (180/Math.PI));
        System.out.println("Angulo b"+this.angulob);

        double Anguloc=(Math.pow(this.ladob,2)) - Math.pow(ladoc,2) - Math.pow(ladoa,2)/(-2*this.ladoa*this.ladoc);
        this.angulob=Math.acos(Anguloc * (180/Math.PI));
        System.out.println("Angulo c"+this.anguloc);

    }

    @Override
    public void Dibujar(MiCanvas donde) {
        super.Dibujar(donde);
        System.out.println("Triangulo dibujado");
    }
}
