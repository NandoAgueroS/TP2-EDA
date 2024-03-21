/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.eda;

/**
 *
 * @author NandoJ
 */
public class Ordenamiento {
    private int[] datos;

    public Ordenamiento() {
        datos=new int[10];
    }
    
    public void carga(){
        for (int i = 0; i < datos.length; i++) {
            datos[i]=(int)(Math.random()*10);
        }
    }
    
    
}
