/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timsorte;

import java.util.Random;

/**
 *
 * @author Enrique Georg
 */
public class Timsorte {

    /**
     * @param args the command line arguments
     */
    static public void printArray(int [] elements) {
        for (int i = 0; i < elements.length; i++) {
            int j = elements[i];
            System.out.println(j);
        }
    }
    public static void main(String[] args) {
    int[] data = new int[500];
    Random rnd = new Random();
	
    for (int i = 0; i < data.length; i++) {
        data[i] = rnd.nextInt(500);
    }
    
    TimSortStrategy timzaoputasso = new TimSortStrategy();
    timzaoputasso.timSort(data);
    
    printArray(data);
    }
    
}
