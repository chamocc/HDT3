/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
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
    
}
