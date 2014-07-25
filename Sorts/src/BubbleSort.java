/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class BubbleSort {
    
    
    public static void bubbleSort(int data[], int n)
    // pre: 0 <= n <= data.length
    // post: values in data[0..n-1] in ascending order
    {
        int numSorted = 0; // number of values in order
        int index; // general index
        int swap;
        while (numSorted < n)
            {
    // bubble a large element to higher array index
                for (index = 1; index < n-numSorted; index++)
                {
                    if (data[index] > data[index+1])
                    {
                       swap = data[index];
                       data[index]=data[index+1];
                       data[index+1]=swap;
                    }
                    
                }
            // at least one more value in place
            numSorted++;
            }
    }
}
