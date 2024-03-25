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

    public void insertionSort() {
        int aux, j;
        for (int i = 1; i < (datos.length); i++) {
            j = i;
            aux = datos[i];
            while (j > 0 && datos[j - 1] > aux) {
                datos[j] = datos[j - 1];
                j--;
            }
            datos[j] = aux;
        }
    }
    //ineficiente para grandes cantidades de informacion pero es uno de los algoritmos mas
    //rapidos para ordenar pequeñas cantidades de elementos. Ademas, requiere pequeñas cantidades de memoria.

    public void shellSort() {
        int aux, j;
        int brecha = (datos.length / 2);

        while (brecha > 0) {
            for (int i = brecha; i < datos.length; i++) {
                aux = datos[i];
                j = i;
                while (j >= brecha && datos[j - brecha] > aux) {
                    datos[j] = datos[j - brecha];
                    j -= brecha;
                }
                datos[j] = aux;
            }
            brecha = brecha / 2;
        }

    }

    //se debe conocer el rango de numeros a ordenar, ese será el tamaño del arreglo de buckets
    public void bucketSort() {
        System.out.println("Bucket sort");
        int size = (datos.length);
        int max = 0;
        int[] buckets;
        int s = 0;
        //recorrido del arreglo original para determinar el valor max y tamaño del arreglo de buckets
        for (int i = 0; i < size; i++) {
            if (datos[i] > max) {
                max = datos[i];
            }
        }
        int bsize = (max + 1);
        buckets = new int[(bsize)];
        //llenado de los buckets
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < bsize; k++) {
                if (k == datos[i]) {
                    buckets[k]++;
                }
            }
        }
        //ordenando el arreglo original con los buckets
        for (int i = 0; i < bsize; i++){
            for (int k = 0; k < buckets[i]; k++) {
                if (buckets[i]>0) {
                    datos[s]=i;
                    s++;
                }
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < datos.length; i++) {
            System.out.print(" " + datos[i]);
        }
        System.out.println("");
    }

}
