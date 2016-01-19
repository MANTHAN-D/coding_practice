import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static int[] ar;
    
      static void quickSort(int left, int right) {         
          if(left<right){
              
              int middle = partition(left,right);                            
              
              quickSort(left,middle-1);
              quickSort(middle+1,right);                 
          }
                    
      }
    
    static int partition(int left, int right){
                
        int pivot = ar[right];                        
       
        int i=left,j=left;
        
        while(i<right){
            while(ar[i]>pivot)
                i++;
            if(i<right){
                int temp = ar[i];
                ar[i++] = ar[j];
                ar[j++]=temp;
            }
            
        }
        ar[right]=ar[j];
        ar[j]=pivot;
          
        printArray();
        return j;
    }
 
      static void printArray() {
         for(int n : ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }            
           quickSort(0,ar.length-1);
       }
}