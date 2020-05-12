/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

/**
 *
 * @author Maxi
 */
public class Matriz {
    int a[][] = new int[4][];
    private int aux1 = 1;
    private int aux = 3;

    public void armar() {
        a[0] = new int[4];
        a[1] = new int[3];
        a[2] = new int[5];
        a[3] = new int[2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = aux;
                aux = aux + 3;
                if (a[i][j] % 2 == 0) {
                System.out.println("Fila " + aux1 + "--->" + a[i][j]);
                }
            }
            aux1++;
        }
    }

}
