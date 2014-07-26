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
    
    private static int partition(int data[], int left, int right)
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
    
    public static void quickSort(int data[], int n) 
// post: the values in data[0..n-1] are in ascending order 
    { 
        quickSortRecursive(data,0,n-1); 
    }
    private static void quickSortRecursive(int data[],int left,int right) 
// pre: left <= right 
// post: data[left..right] in ascending order 
        { int pivot; // the final location of the leftmost value 
        if (left >= right) return; 
        pivot = partition(data,left,right); /* 1 - place pivot */ 
        quickSortRecursive(data,left,pivot-1); /* 2 - sort small */ 
        quickSortRecursive(data,pivot+1,right);/* 3 - sort large */
/* done! */ 
    }
}
    

