package dsajune.dsajune1.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_9_Separate_Odd_Even {
    public static void main(String args[]){
        int[] arr={3,1,2,5,4,2,7,6,8,3,9,4,6};
    System.out.println("Original Array : "+Arrays.toString(arr));
    oddEvenHelper(arr);

    }
    public static void oddEvenHelper(int arr[]){
        if(arr==null || arr.length<1){
            System.out.println("Array is either empty or null");
            return;
        }
        List<Integer>evenList=new ArrayList<>(); 
        List<Integer>oddList=new ArrayList<>(); 
        System.out.println("EvenList : "+evenList);
        System.out.println("Odd List : "+oddList);
        
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){ // this can be written as arr[i] &1 but i am getting erro
                    evenList.add(arr[i]);
            }else{
                oddList.add(arr[i]);
            }
        }
        System.out.println("EvenList : "+evenList);
        System.out.println("Odd List : "+oddList);
        
    }
}
