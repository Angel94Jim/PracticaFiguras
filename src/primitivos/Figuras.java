package primitivos;

import java.util.List;

public class Figuras {
    public Figuras(String nombre) {
        this._nombre=nombre;
        this._es_valido=false;
    }

    private String _nombre;
    protected boolean _es_valido;
    protected List<Puntos> cordenadas;

    public boolean is_es_valido() {
        return _es_valido;
    }

    public void Dibujar(MiCanvas donde){
        System.out.println("Dibujar figura");
    }
}


