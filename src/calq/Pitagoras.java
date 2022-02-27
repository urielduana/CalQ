package calq;

import java.util.*;

import javax.swing.JOptionPane;
public class Pitagoras {
public Scanner lea = new Scanner (System.in);
public double a, b, c, x;

public  void Menu () {
        
        int opc = 0;
        
        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "== Teorma de Pitagoras ==" 
        + "¿Qué desea hallar? "
        + "\n 1.- Hipotenusa "
        + "\n 2.- Cateto A"
        + "\n 3.- Cateto B")) ;




        switch (opc) {
        case 1:
            hipotenusa();
        break;
        case 2:
            catetoA();
        break;
        case 3:
            catetoB();
        break;

}

} /* fin void main */


        public void hipotenusa() {
            a=0; b=0; c=0;
                
                a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cateto A"));
                b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cateto B"));
                
                x = ((a*a)+(b*b));
                c = Math.sqrt(x);
                
            JOptionPane.showMessageDialog(null, "La Hipotenusa del triangulo es: " + c);
        }

        public void catetoA() {
            a=0; b=0; c=0;
            
                b= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cateto B"));
                c= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cateto HIPOTENUSA"));
                        
                x = ((c*c)-(b*b));
                a = Math.sqrt(x);
                
            JOptionPane.showMessageDialog(null, "El Cateto A del triangulo es: " + a);
        }
        public void catetoB() {
            a=0; b=0; c=0;
            
                a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cateto A"));
                c= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cateto HIPOTENUSA"));
                
                x = ((c*c)-(a*a));
                b = Math.sqrt(x);
                
            JOptionPane.showMessageDialog(null, "El Cateto B del triangulo es: " + b);
        }

}