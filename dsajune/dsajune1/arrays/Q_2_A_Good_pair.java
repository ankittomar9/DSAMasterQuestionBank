package dsajune.dsajune1.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Q_2_A_Good_pair {
    public static void main(String args[]){
            int[] arr={1,2,3,4,4,5};int target=7;
            System.out.println("Original Array : \n"+Arrays.toString(arr));
            goodPairHelper(arr, target);

    }
    public static void goodPairHelper(int[] arr,int target){
        if(arr==null || arr.length<1){
            System.out.println("Array is null or empty");
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int totalPairs=0;
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int required=target-current;
            
            if(map.containsKey(required)){
                int freq=map.get(required);
                totalPairs=totalPairs+freq;
                for(int j=0;j<freq;j++){
        System.out.println("pair Found : (" +required+" ,"+current+")");
                }
                
            }
            map.put(current, map.getOrDefault(current,0)+1);
            
        }
          System.out.println("Original Array : \n"+totalPairs);
    }

}
