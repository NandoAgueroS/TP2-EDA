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
        datos = new int[10];
    }

    public void carga() {
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 10);
        }
    }

    public void bubbleSort() {
        int aux;
        boolean c;
        for (int i = (datos.length - 1); i >= 0; i--) {
            c = true;
            for (int j = 1; j <= i; j++) {
                if (datos[j - 1] > datos[j]) {
                    aux = datos[j - 1];
                    datos[j - 1] = datos[j];
                    datos[j] = aux;
                    c = false;
                }
            }
             if (c) {
                i = 0;
            }
        }
    }
    public void insertionSort(){
        int aux,j;
        for (int i = 1; i < (datos.length); i++) {
            j=i;
            aux=datos[i];
            while (j>0 && datos[j-1]>aux) {
                datos[j]=datos[j-1];
                j--;
            }
            datos[j]=aux;
        }
    }

    public void mostrar() {
        for (int i = 0; i < datos.length; i++) {
            System.out.print(" " + datos[i]);
        }
        System.out.println("");
    }

}
