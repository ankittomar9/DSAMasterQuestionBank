package dsajune.dsajune1.arrays;

import java.util.Arrays;

public class Q_13_Range_Sum_Queries {
    public static void main(String args[]){
        int arr[]={10,20,10,5,15};System.out.println("Original Array : "+Arrays.toString(arr));
        int queries[][]={{1,3},{0,4},{2,7}};
        System.out.println("Original Array : "+Arrays.deepToString(queries));
        rangeSumQueriesHelper(arr, queries);

    }
    public static void rangeSumQueriesHelper(int[] arr,int[][] queries){
        if(arr==null || arr.length==0 || queries==null || queries.length==0){
            System.out.println("Array is either empty or null or Queries is :");return;    }

            int prefixArr[]=new int[arr.length];
            prefixArr[0]=arr[0];
            for(int i=1;i<arr.length;i++){
                    prefixArr[i]=prefixArr[i-1]+arr[i];
            }
            System.out.println("Original Array : "+Arrays.toString(prefixArr));
            int sum=0; int n=arr.length;
            for(int i=0;i<queries.length;i++){
                int s=queries[i][0];
                int e=queries[i][1];

                 if (s < 0 || e >= n || s > e) {
                System.out.println("Query [" + s + ", " + e + "] is OUT OF BOUNDS for array of size " + n);
                continue; // Skip invalid query so program doesn't crash
            }

                if(s==0){
                    sum=prefixArr[e];
                }else{
                    sum=prefixArr[e]-prefixArr[s-1];
                }
                System.out.println("range [ "+s+" , "+e+" ] Sum = "+sum  );
            }
    }
}
