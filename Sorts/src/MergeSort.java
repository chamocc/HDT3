/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class MergeSort {
    
    private static void merge(int data[], int temp[],int low, int middle, int high)
        // pre: data[middle..high] are ascending
        // temp[low..middle-1] are ascending
        // post: data[low..high] contains all values in ascending order
    {
        int ri = low; // result index
        int ti = low; // temp index
        int di = middle; // destination index
        // while two lists are not empty merge smaller value
        while (ti < middle && di <= high)
        {
            if (data[di] < temp[ti])
            {
                data[ri++] = data[di++]; // smaller is in high data
            }
            else 
            {
                data[ri++] = temp[ti++]; // smaller is in temp
            }
        }
        // possibly some values left in temp array
        while (ti < middle)
        {
            data[ri++] = temp[ti++];
        }
        // ...or some values left (in correct place) in data array
    }
        
    
}
