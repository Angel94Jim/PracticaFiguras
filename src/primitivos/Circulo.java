package primitivos;

import java.util.ArrayList;

public class Circulo extends Figuras{

    private double radio;

    Circulo(String nombre,double radio)
    {
        super(nombre);
        this.radio=radio;
        this.cordenadas=cordenadas= new ArrayList<Puntos>();
        this._es_valido=this.ValidarCirculo();
    }

    public boolean ValidarCirculo(){
        return (this.radio>0);
    }

    public double CalcularArea(){
        return Math.PI*(this.radio*this.radio);
    }

    public double CalcularPerimetro(){
        return (2*Math.PI)*this.radio;

    }

    @Override
    public void Dibujar(MiCanvas donde) {
        super.Dibujar(donde);
        System.out.println("Dibujar Circulo");
    }
}
