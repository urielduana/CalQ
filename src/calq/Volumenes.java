package calq;

import javax.swing.JOptionPane;

public class Volumenes {
    
    private double area;
    
    public Volumenes(){
    area = 0;
}
    
    public void Cubo(){
        double lado = 0, volumen = 0;
        
        lado = Double.parseDouble(JOptionPane.showInputDialog("- - - - CUBO - - - -\n\n"
                + "Introduce el lado del cubo (cm):"));
        
        volumen = lado * lado * lado;
        
        JOptionPane.showMessageDialog(null, "- - - - CUBO - - - -\n\n"
                + "El LADO introducido fue: " + lado + "cm"
                + "\nEl VOLUMEN del CUBO es: " + volumen + "cm3");
    }
    
    public void Cilindro(){
        double altura = 0, radio = 0, volumen = 0;
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("- - - - CILINDRO - - - -\n\n"
                + "Introduce la altura del cilindro (cm):"));
        radio = Double.parseDouble(JOptionPane.showInputDialog("- - - - CILINDRO - - - -\n\n"
                + "Introduce el radio del cilindro (cm):"));
        
        volumen = radio * radio * altura *Math.PI;
        
        JOptionPane.showMessageDialog(null, "- - - - CILINDRO - - - -\n\n"
                + "La ALTURA introducida fue: " + altura + "cm"
                + "\nEl RADIO introducido fue: " + radio + "cm"
                + "\nEl VOLUMEN del CILINDRO es: " + volumen + "cm3");
    }
    
    public void Esfera(){
        double radio = 0, volumen = 0;
        
        radio = Double.parseDouble(JOptionPane.showInputDialog("- - - - ESFERA - - - -\n\n"
                + "Introduce el radio de la esfera (cm):"));
        
        volumen = (((4)*(Math.PI)*(radio*radio*radio))/3);
        
        JOptionPane.showMessageDialog(null, "- - - - ESFERA - - - -\n\n"
                + "El RADIO introducido fue: " + radio + "cm"
                + "\nEl VOLUMEN de la ESFERA es: " + volumen + "cm3");
    }
    
    public void Cono(){
        double radio = 0, volumen = 0, altura = 0;
        
        radio = Double.parseDouble(JOptionPane.showInputDialog("- - - - CONO - - - -\n\n"
                + "Introduce el radio del cono (cm):"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("- - - - CONO - - - -\n\n"
                + "Introduce el radio del cono (cm):"));
        
        volumen = (((altura)*(Math.PI)*(radio*radio))/3);
        
        JOptionPane.showMessageDialog(null, "- - - - CONO - - - -\n\n"
                + "El RADIO introducido fue: " + radio + "cm"
                + "\nLa ALTURA introducida fue: " + altura + "cm"
                + "\nEl VOLUMEN del CONO es: " + volumen + "cm3");
    }
    
    public void Areas(){
        double base = 0, altura = 0, apotema = 0, baseMayor = 0, baseMenor = 0, lado = 0, perimetro = 0, numero = 0;
        
        area = 0;
        
        int eleccion = 0;
        String[] options = {"CUADRADO", "TRIANGULO", "RECTANGULO", "TRAPECIO", "POLIGONO REGULAR (+5)"};
        
        eleccion = JOptionPane.showOptionDialog(null, "Seleccione la base de su figura: ", " - - - - MENU BASES - - - - ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
        switch(eleccion){
            
            case 0://CUADRADO
                
                lado = Double.parseDouble(JOptionPane.showInputDialog("- - - - CUADRADO - - - -\n\n"
                + "Introduce el lado del cuadrado:")); 
                
                area = lado * lado;
                
                break;
                
                
            case 1://TRIANGULO
                
                base = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRIANGULO - - - -\n\n"
                + "Introduce la base del triangulo:"));
                
                altura = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRIANGULO - - - -\n\n"
                + "Introduce la altura del triangulo:")); 
                
                area = ((base * altura) / 2);
                
                break;
                
                
            case 2://RECTANGULO
                
                base = Double.parseDouble(JOptionPane.showInputDialog("- - - - RECTANGULO - - - -\n\n"
                + "Introduce la base del rectangulo:")); 
                
                altura = Double.parseDouble(JOptionPane.showInputDialog("- - - - RECTANGULO - - - -\n\n"
                + "Introduce la altura del rectangulo:"));
                
                area = base * altura;
                
                break;
                
                
            case 3://TRAPECIO
                
                baseMayor = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce la base mayor del trapecio:")); 
                
                baseMenor = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce la base menor del trapecio:")); 
                
                altura = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce la altura menor del trapecio:"));
        
                area = (((baseMayor + baseMenor) * altura)/2);
                
                break;
                
                
            case 4://POLIGONO
                
                lado = Double.parseDouble(JOptionPane.showInputDialog("- - - - POLIGONO REGULAR (+5) - - - -\n\n"
                + "Introduce el lado del poligono:")); 
                apotema = Double.parseDouble(JOptionPane.showInputDialog("- - - - POLIGONO REGULAR (+5) - - - -\n\n"
                + "Introduce el apotema del poligono:")); 
                numero = Double.parseDouble(JOptionPane.showInputDialog("- - - - POLIGONO REGULAR (+5) - - - -\n\n"
                + "Introduce el numero de lados del poligono:")); 
        
                perimetro = numero * lado;
                
                area = ((perimetro * apotema) / 2);
                
                break;           
            
        }
    }
    
    public void Prismas(){
        
        Areas();
        
        double volumen = 0, altura = 0;
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("- - - - PRISMA - - - -\n\n"
                + "Introduce la altura del prisma (cm):"));
        
        volumen = area * altura;
        
        JOptionPane.showMessageDialog(null, "- - - - PRISMA - - - -\n\n"
                + "El AREA de la base fue: " + area + " cm2"
                + "\nEl VOLUMEN del PRISMA es: " + volumen + "cm3");
        
        area = 0;
        
    }
    public void Piramides(){
        
        Areas();
        
        double volumen = 0, altura = 0;
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("- - - - PIRAMIDE - - - -\n\n"
                + "Introduce la altura del prisma (cm):"));
        
        volumen = ((area * altura)/3);
        
        JOptionPane.showMessageDialog(null, "- - - - PIRAMIDE - - - -\n\n"
                + "El AREA de la base fue: " + area + " cm2"
                + "\nEl VOLUMEN de la PIRAMIDE es: " + volumen + "cm3");
        
        area = 0;
        
    }
}
