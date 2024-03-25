/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.eda;

/**
 *
 * @author NandoJ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ordenamiento o1=new Ordenamiento();
        o1.carga();
        System.out.println("---Carga Original---");
        o1.mostrar();
//        
//        o1.bubbleSort();
//        System.out.println("---Bubble Sort---");
//        o1.mostrar();
//
//        o1.insertionSort();

        o1.bucketSort();
        o1.mostrar();
    }
    
}
