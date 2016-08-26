package codigoqr;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        int a[] = new int[100];
        for (int i = 0; i < 100; i++)
            a[i] = new Random().nextInt(100) + 1;
        for(int i : a)
            System.out.print(i + " ");
        
        System.out.println();
        quicksort(a);
           
        for(int i : a)
            System.out.print(i + " ");
    }

    public static void quicksort(int[] a) {
        quicksort(a, 0, a.length - 1);
    }

    private static void quicksort(int[] a, int limIzq, int limDer) {
        if (limIzq < limDer) {
            int izq = limIzq;
            int der = limDer;
            boolean indiceIzq = true;
            
            while(izq < der) {
                if(indiceIzq) {
                    if(a[izq] > a[der]) {
                        swap(a, izq, der);
                        izq++;
                        indiceIzq = false;
                    } else {
                        der--;
                    }
                } else {
                    if(a[izq] > a[der]) {
                        swap(a, izq, der);
                        der--;
                        indiceIzq = true;
                    } else {
                        izq++;
                    }
                }
            }
            quicksort(a, limIzq, izq - 1);
            quicksort(a, izq + 1, limDer);
        }
    }
    
    private static void swap(int[]a, int x, int y) {
        int aux = a[x];
        a[x] = a[y];
        a[y] = aux;
    }
}
