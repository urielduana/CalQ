package primerParcial;

import javax.swing.JOptionPane;

public class ListaSimple {
    
    private nodo primerNodo,UltimoNodo;

    public ListaSimple(){
        
        primerNodo=new nodo();
        UltimoNodo=new nodo();

    }
    
    public void AgregarInicio(){
       
        nodo nuevoNodo=new nodo();

        String dato="";

        dato = JOptionPane.showInputDialog("Ingresa tu nombre: ");

        nuevoNodo.setDato(dato);

        if(primerNodo!=null){
            nuevoNodo.setSiguienteNodo(primerNodo);
            primerNodo=nuevoNodo;
        }else{
            primerNodo = UltimoNodo=nuevoNodo;
        }

    }
    
    public void AgregarFinal(){
        
        nodo nuevoNodo = new nodo();

        String dato = "";

        dato = JOptionPane.showInputDialog("Ingresar tu nombre: ");

        if (UltimoNodo!=null){
            UltimoNodo.setSiguienteNodo(nuevoNodo);
            UltimoNodo=nuevoNodo;
        }else{
            primerNodo = UltimoNodo = nuevoNodo;
        }

    }
    
}