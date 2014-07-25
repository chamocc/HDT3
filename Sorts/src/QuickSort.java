/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @Daniel Gerendas 13158
 * @Alejandro Diaz 13082
 * @Edgar Chamo 13083
 * @since 25/07/2014
 */
public class QuickSort {
    
    private static int quickSort(int data[], int left, int right)
    // pre: left <= right
    // post: data[left] placed in the correct (returned) location
    {
        while (true)
        {
            // move right "pointer" toward left
        while (left < right && data[left] < data[right]) right--;
        if (left < right) swap(data,left++,right);
    else return left;
    // move left pointer toward right
    while (left < right && data[left] < data[right]) left++;
    if (left < right) swap(data,left,right--);
    else return right;
    }
    }

    private static void swap(int[] data, int i, int right) 
    {
      int temp;
      temp = data[i];
      data[i]=data[right];
      data[right]=temp;
    }
    
}
