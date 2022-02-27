
package calq;

import javax.swing.JOptionPane;

public class Estadistica_Probabilidad {
    
    //                        --Seccion de varianza--
    public static void varianza(){
    double[] guardar_datos = new double[15];
    int contador_suma,n1,cont=0;
    double x=0,x1=0,s=0,s1=0,r,dato;
    String[] Opciones_pobla_muestra={"De poblacion","De muestra"};
    int eleccion=JOptionPane.showOptionDialog(null,"¿De qué tipo es la varianza? (Máximo 15 datos)","Bienvenido",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,Opciones_pobla_muestra,Opciones_pobla_muestra[0]);
    switch(eleccion){
        case 0:
            contador_suma=Integer.valueOf(JOptionPane.showInputDialog("Introduce la cantidad de datos"));
            n1=contador_suma;
            for (int i = 0; i < contador_suma; i++) {
                dato=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu dato"));
                x1=x1+dato;
                guardar_datos[i]=dato;
            }
            x1=x1/contador_suma;;
            while (n1!=0){
                x=guardar_datos[cont];
                s=(x-x1)*(x-x1);
                s1=s1+s;
                n1--;
                cont++;
            }
            r=s1/contador_suma;
            JOptionPane.showMessageDialog(null,"La varianza de población es de "+r);
            break;
        case 1: 
            contador_suma=Integer.valueOf(JOptionPane.showInputDialog("Introduce la cantidad de datos"));
            n1=contador_suma;
            for (int i = 0; i < contador_suma; i++) {
                dato=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu dato"));
                x1=x1+dato;
                guardar_datos[i]=dato;
            }
            x1=x1/contador_suma;;
            while (n1!=0){
                x=guardar_datos[cont];
                s=(x-x1)*(x-x1);
                s1=s1+s;
                n1--;
                cont++;
            }
            r=s1/(contador_suma-1);
            JOptionPane.showMessageDialog(null,"La varianza de muestra es de "+r);
            break;
    }
}
    //                                 --Desviacion estandar--
    public static void desviacion(){
        double[] guardar_datos = new double[15];
    int contador_suma,n1,cont=0;
    double x=0,x1=0,s=0,s1=0,r,dato,r2;
    String[] Opciones_pobla_muestra={"De poblacion","De muestra"};
    int eleccion=JOptionPane.showOptionDialog(null,"¿De qué tipo es la desviación?","Bienvenido",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,Opciones_pobla_muestra,Opciones_pobla_muestra[0]);
    switch(eleccion){
        case 0:
            contador_suma=Integer.valueOf(JOptionPane.showInputDialog("Introduce la cantidad de datos (Máximo 15 datos)"));
            n1=contador_suma;
            for (int i = 0; i < contador_suma; i++) {
                dato=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu dato"));
                x1=x1+dato;
                guardar_datos[i]=dato;
            }
            x1=x1/contador_suma;;
            while (n1!=0){
                x=guardar_datos[cont];
                s=(x-x1)*(x-x1);
                s1=s1+s;
                n1--;
                cont++;
            }
            r=s1/contador_suma;r2=Math.sqrt(r);
            JOptionPane.showMessageDialog(null,"La desviación estandar de población es de "+r2);
            break;
        case 1: 
            contador_suma=Integer.valueOf(JOptionPane.showInputDialog("Introduce la cantidad de datos"));
            n1=contador_suma;
            for (int i = 0; i < contador_suma; i++) {
                dato=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu dato"));
                x1=x1+dato;
                guardar_datos[i]=dato;
            }
            x1=x1/contador_suma;;
            while (n1!=0){
                x=guardar_datos[cont];
                s=(x-x1)*(x-x1);
                s1=s1+s;
                n1--;
                cont++;
            }
            r=s1/(contador_suma-1);r2=Math.sqrt(r);
            JOptionPane.showMessageDialog(null,"La desviación estandar de muestra es de "+r2);
            break;
    }
    }
    //                                --Seccion de permutaciones--
    public static void permutacion(){
        double dato_n,dato_k,x_permutacion,n,n1=1,k,k1=1,x;
        String[] Opciones_permutacion={"Con repeticiones","Sin repeticiones"};
        int eleccion=JOptionPane.showOptionDialog(null,"¿De qué tipo es la permutación?","Bienvenido",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,Opciones_permutacion,Opciones_permutacion[0]);
        switch(eleccion){
            case 0:
                dato_n=Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de elementos (n)"));
                dato_k=Double.parseDouble(JOptionPane.showInputDialog("Introduce los grupos deseados (k)"));
                x_permutacion=Math.pow(dato_n,dato_k);
                JOptionPane.showMessageDialog(null, "El resultado es "+x_permutacion);
                break;
            case 1:
                dato_n=Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de elementos (n)(Máximo 15 datos)"));
                dato_k=Double.parseDouble(JOptionPane.showInputDialog("Introduce los grupos deseados (k)"));
                x=(dato_n-dato_k);
                if (dato_n==1) {
                    n1=1;
                    }
                
                if (x<0) {
                    while(dato_n!=0){
                    n1=n1*dato_n;dato_n--;
                }
                    x_permutacion=n1;
                }else{
                while(dato_n!=0){
                    n1=n1*dato_n;dato_n--;
                }
                while(x!=0){
                    k1=x*k1;x--;
                }
                x_permutacion=n1/k1; 
                }                
                JOptionPane.showMessageDialog(null,"El resultado es "+ x_permutacion);
                break;
        }
    }
    //                       --Seccion de combinaciones--
    public static void combinacion(){
        double dato_n,dato_k,x_combinacion,n1=1,k1=1,x,k2=1;
        dato_n=Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de elementos (n)"));
        dato_k=Double.parseDouble(JOptionPane.showInputDialog("Introduce los grupos deseados (k)"));
        x=(dato_n-dato_k);
        if (dato_n==1) {
                    n1=1;
                    }
                if (x<0) {
                    while(dato_n!=0){
                    n1=n1*dato_n;dato_n--;
                }
                    x_combinacion=n1;  
        }else{
                while(dato_n!=0){
                    n1=n1*dato_n;dato_n--;
                }
                while(x!=0){
                    k1=x*k1;x--;
                }
                while(dato_k!=0){
                k2=k2*dato_k;dato_k--;
                }
                x_combinacion=n1/(k1*k2);
            }
                JOptionPane.showMessageDialog(null,"El resultado es "+ x_combinacion);
    }
    //                   --Media, mediana y moda--
    public static void tresM(){
        
        double x1=0,dato=0,media,burbuja,moda=0;
        int x=0,maximorepetidos=0;
        int eleccion2;
        String[] Opcion={"Media","Mediana","Moda"};
        int eleccion=JOptionPane.showOptionDialog(null,"Elige tu opción","Bienvenido",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,Opcion,Opcion[0]);
        eleccion2=Integer.valueOf(JOptionPane.showInputDialog("Introduce la cantidad de datos"));
        double[] guardar_datos = new double[eleccion2];
        for (int i = 0; i < eleccion2; i++) {
            dato=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu dato"));
            guardar_datos[i]=dato;
            x1=x1+guardar_datos[i];
        }
        media=x1/eleccion2;
        switch(eleccion){
                case 0: 
                JOptionPane.showMessageDialog(null,"La media de tus datos es de "+ media);
                break;
            case 1:
                for (int recorrido = 1; recorrido < guardar_datos.length; recorrido++) {
                    for (int posicion = 0; posicion < (guardar_datos.length-1); posicion++) {
                        if (guardar_datos[posicion]>guardar_datos[posicion+1]) {
                            burbuja=guardar_datos[posicion];
                            guardar_datos[posicion]=guardar_datos[posicion+1];
                            guardar_datos[posicion+1]=burbuja;
                        }
                    }
                }
                if (eleccion2/2==0) {
                        JOptionPane.showMessageDialog(null, "La mediana es "+guardar_datos[eleccion2/2]);
                    }else{
                        JOptionPane.showMessageDialog(null, "La mediana es "+(guardar_datos[eleccion2/2]));
                    }
                break;
            case 2:
                for (int recorrido = 0; recorrido < guardar_datos.length; recorrido++) {
                    int vecesrepetido=0;
                    for (int posicion = 0; posicion < guardar_datos.length; posicion++) {
                        if (guardar_datos[recorrido]==guardar_datos[posicion]) {
                            vecesrepetido++;
                        }
                        if (vecesrepetido>maximorepetidos) {
                            moda=guardar_datos[recorrido];
                            maximorepetidos=vecesrepetido;
                        }
                    }
                }   JOptionPane.showMessageDialog(null,"La moda es: "+moda+" se repitió "+ maximorepetidos+" veces");
                break;
        }
    }
    //                   --Testeo-- 
    /*public static void main(String[] args){
       tresM();
    }*/
}
