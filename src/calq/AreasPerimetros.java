package calq;

import javax.swing.JOptionPane;

public class AreasPerimetros {
    
    
    public void Cuadrado(){
        
        double lado=0, area=0, perimetro=0;
        
        lado = Double.parseDouble(JOptionPane.showInputDialog("- - - - CUADRADO - - - -\n\n"
                + "Introduce el lado del cuadrado (cm):")); 
        
        area = lado * lado;
        perimetro = lado * 4;
        
        JOptionPane.showMessageDialog(null, "- - - - CUADRADO - - - -\n\n"
                + "El LADO introducido fue: " + lado + " cm"
                + "\nEl AREA del CUADRADO es: " + area + " cm2"
                + "\nEl PERIMETRO del CUADRADO es: " + perimetro  + " cm");
}
    public void Circulo(){
        
        double radio=0, area=0, perimetro;
        
        radio = Double.parseDouble(JOptionPane.showInputDialog("- - - - CIRCULO - - - -\n\n"
                + "Introduce el radio del circulo (cm):")); 
        
        area = radio * radio * (Math.PI);
        perimetro = 2 * radio * (Math.PI);
        
        JOptionPane.showMessageDialog(null, "- - - - CIRCULO - - - -\n\n" 
                + "El RADIO introducido fue: " + radio  + " cm"
                + "\nEl AREA del CIRCULO es: " + area + " cm2"
                + "\nEl PERIMETRO del CIRCULO es: " + perimetro + " cm");
    }
    
    public void Rectangulo(){
        double base=0, altura = 0, area=0, perimetro=0;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("- - - - RECTANGULO - - - -\n\n"
                + "Introduce la base del rectangulo (cm):")); 
        altura = Double.parseDouble(JOptionPane.showInputDialog("- - - - RECTANGULO - - - -\n\n"
                + "Introduce la altura del rectangulo (cm):"));
        
        area = base * altura;
        perimetro = base + base + altura + altura;
        
        JOptionPane.showMessageDialog(null, "- - - - RECTANGULO - - - -\n\n"
                + "La BASE introducida fue: " + base  + " cm"
                + "\nLa ALTURA introducida fue: " + altura  + " cm"
                + "\nEl AREA del RECTANGULO es: " + area + " cm2"
                + "\nEl PERIMETRO del RECTANGULO es: " + perimetro  + " cm");
    }
    
    public void TrapecioArea(){
        double baseMayor=0, baseMenor=0, altura=0, area=0;
        
        baseMayor = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce la base mayor del trapecio (cm):")); 
        baseMenor = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce la base menor del trapecio (cm):")); 
        altura = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce la altura menor del trapecio (cm):"));
        
        area = (((baseMayor + baseMenor) * altura)/2);
        
        JOptionPane.showMessageDialog(null, "- - - - TRAPECIO - - - -\n\n"
                + "La BASE MAYOR introducida fue: " + baseMayor  + " cm"
                +"\nLa BASE MENOR introducida fue: " + baseMenor  + " cm"
                +"\nLa ALTURA introducida fue: " + altura  + " cm"
                + "\nEl AREA del TRAPECIO es: " + area + " cm2");
    }
    public void TrapecioPerimetro(){
        double baseMayor=0, baseMenor=0, lado=0, perimetro=0;
        
        baseMayor = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce la base mayor del trapecio (cm):")); 
        baseMenor = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce la base menor del trapecio (cm):")); 
        lado = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce el lado menor del trapecio (cm):"));
        
        perimetro = lado + lado +  baseMayor + baseMenor;
        
        JOptionPane.showMessageDialog(null, "- - - - TRAPECIO - - - -\n\n"
                + "La BASE MAYOR introducida fue: " + baseMayor  + " cm"
                +"\nLa BASE MENOR introducida fue: " + baseMenor  + " cm"
                +"\nEl LADO introducido fue: " + lado  + " cm"
                + "\nEl PERIMETRO del TRAPECIO es: " + perimetro  + " cm");
    }
    
    public void RomboArea(){
        double diagonalMayor=0, diagonalMenor=0, area=0;
        
        diagonalMayor = Double.parseDouble(JOptionPane.showInputDialog("- - - - ROMBO - - - -\n\n"
                + "Introduce la diagonal mayor del rombo (cm):")); 
        diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog("- - - - ROMBO - - - -\n\n"
                + "Introduce la diagonal menor del rombo (cm):"));
        
        area = ((diagonalMayor * diagonalMenor)/2);
        
        JOptionPane.showMessageDialog(null, "- - - - ROMBO - - - -\n\n"
                + "La DIAGONAL MAYOR introducida fue: " + diagonalMayor  + " cm"
                +"\nLa DIAGONAL MENOR introducida fue: " + diagonalMenor  + " cm"
                + "\nEl AREA del TRAPECIO es: " + area + " cm2");        
    }
    public void RomboPerimetro(){
    double lado = 0, perimetro=0;
    
    lado = Double.parseDouble(JOptionPane.showInputDialog("- - - - ROMBO - - - -\n\n"
                + "Introduce el lado del rombo (cm):")); 
    
    perimetro = lado * 4;
    
    JOptionPane.showMessageDialog(null, "- - - - ROMBO - - - -\n\n"
                + "El LADO introducido fue: " + lado  + " cm"
                + "\nEl PERIMETRO del ROMBO es: " + perimetro  + " cm");     
}
    
    public void PoligonoRegular(){
        double lado = 0, apotema = 0, numero = 0, area = 0, perimetro = 0;
        
        lado = Double.parseDouble(JOptionPane.showInputDialog("- - - - POLIGONO REGULAR (+5) - - - -\n\n"
                + "Introduce el lado del poligono (cm):")); 
        apotema = Double.parseDouble(JOptionPane.showInputDialog("- - - - POLIGONO REGULAR (+5) - - - -\n\n"
                + "Introduce el apotema del poligono (cm):")); 
        numero = Double.parseDouble(JOptionPane.showInputDialog("- - - - POLIGONO REGULAR (+5) - - - -\n\n"
                + "Introduce el numero de lados del poligono (cm):")); 
        
        perimetro = numero * lado;
        area = ((perimetro * apotema) / 2);
        
        JOptionPane.showMessageDialog(null, "- - - - POLIGONO REGULAR (+5) - - - -\n\n"
                + "El LADO introducido fue: " + lado  + " cm"
                + "\nEl APOTEMA introducido fue: " + apotema  + " cm"
                + "\nEl AREA del POLIGONO es: " + area + " cm2"
                + "\nEl PERIMETRO del POLIGONO es: " + perimetro  + " cm"); 
    }
    
    //TRIANGULOS
    
    public void TrianguloHeron(){
        double lado1 = 0, lado2= 0, lado3 = 0, perimetro = 0, semiperimetro = 0, area = 0;
        
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRIANGULO - - - -\n\n"
                + "Introduce el lado 1 del triangulo (cm):"));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRIANGULO - - - -\n\n"
                + "Introduce el lado 2 del triangulo (cm):"));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRIANGULO - - - -\n\n"
                + "Introduce el lado 3 del triangulo (cm):"));
        
        perimetro = lado1 + lado2 + lado3 ;
        semiperimetro = perimetro / 2;
        area = (Math.sqrt((semiperimetro)*(semiperimetro - lado1)*(semiperimetro - lado2)*(semiperimetro - lado2)));
        
        JOptionPane.showMessageDialog(null, "- - - - TRIANGULO - - - -\n\n"
                + "El PERIMETRO introducido fue: " + perimetro  + " cm"
                + "\nEl AREA el triagulo es: " + area + " cm2");
    }
    public void TrianguloBasico(){
        double base = 0, altura = 0, area=0;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRIANGULO - - - -\n\n"
                + "Introduce la base del triangulo (cm):"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("- - - - TRIANGULO - - - -\n\n"
                + "Introduce la altura del triangulo (cm):")); 
        
        area = ((base * altura) / 2);
        
        JOptionPane.showMessageDialog(null, "- - - - TRIANGULO - - - -\n\n"
                + "La BASE introducida fue: " + base  + " cm"
                + "\nLa ALTURA introducia gue: " + altura  + " cm"
                + "\nEl AREA el triagulo es: " + area + " cm2");
    }
}



