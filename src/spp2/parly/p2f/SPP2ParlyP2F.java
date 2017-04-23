/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.parly.p2f;
import javax.swing.JOptionPane;

/** 
 *Parly
 *CECILIA GUTIÉRREZ DE LARA HERNÁNDEZ
 *NORMA LEDEZMA MARTÍNEZ
 *ERICK EDUARDO GERVACCI ROMERO
 *DIEGO SANTANA LEIVA
 *BENITO RAFAEL MORANTE VÁZQUEZ
 */
public class SPP2ParlyP2F {

    
    public static void main(String[] args) {
       Matriz();
    }
    public static int solicitaEntero(String mensaje){
     
        int num = 0;
        boolean flag;
        do{
            try{
           String dato = JOptionPane.showInputDialog (null, mensaje);
            num = Integer.parseInt(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return num;
    }
    public static double solicitaDouble(String mensaje){
     
        double num = 0;
        boolean flag;
        do{
            try{
           String dato = JOptionPane.showInputDialog (null, mensaje);
            num = Double.parseDouble(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return num;
    }
    public static double[] Matriz(){
        double suma=0;
        int var=solicitaEntero ("¿Cuántas cantidades capturará?"); 
        double [] arreglo = new double [var];
        
        for (int i=0; i<arreglo.length; i++){
                arreglo[i]= solicitaDouble("Introduzca una cantidad:");
                suma = (suma + arreglo[i]);
            }
        
        JOptionPane.showMessageDialog (null, "El total de gastos es: " + suma);
    return arreglo;
    }
}
    
