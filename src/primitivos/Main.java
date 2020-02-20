package primitivos;

import javax.swing.*;

public class Main {
     public static void main(String[] args){


         Circulo circulo=new Circulo("circulo",50.0);
         Triangulos triangulo=new Triangulos("triangulo",30, 30,30);

         if(circulo._es_valido)
         {
             //circulo.Dibujar();
         }

         MiCanvas canvas=new MiCanvas();
         JFrame ventana=new JFrame("canvas");
        ventana.getContentPane().add(canvas);
        ventana.getSize(400,400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     }
}
