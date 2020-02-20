package primitivos;

import javax.swing.*;
import java.awt.*;

public class MiCanvas {
    public void init()
    {
        this.circulo=new Circulo("circulo",50);
        this.triangulos=new Triangulos("traingulos",100,100,100);


    }

    private Triangulos triangulos;
    private Circulo circulo ;

    public void update(Graphics g)
    {
        paint(g);
    }

    public void paintComponent(Graphics g)
    {
        circulo.Dibujar();
        triangulos.Dibujar();
    }


}
