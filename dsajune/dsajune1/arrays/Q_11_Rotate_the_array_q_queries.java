package dsajune.dsajune1.arrays;
import java.util.Arrays;
public class Q_11_Rotate_the_array_q_queries {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};        int queries[]={2,3,1};
        System.out.println("Original Array : \n"+Arrays.toString(arr));
        System.out.println("Original Queries : \n"+Arrays.toString(queries));
        rotateHelper(arr, queries);
      
        
    }
    public static void rotateHelper(int arr[],int[] queries){
        if(arr==null || arr.length==0 || queries==null ||queries.length<1){
            System.out.println("Array is either  empty or null or Queries not exists");
            return ;
        }
        int start =0; int end=arr.length-1;
         int n=arr.length       ; int k=0;
          
        for(int i=0;i<queries.length;i++){
          int copyArr[]=Arrays.copyOf(arr, arr.length);
             k=queries[i];
            k=k%arr.length;
             reverseHelper(copyArr, 0, k-1);
        reverseHelper(copyArr, k, end);
        reverseHelper(copyArr, 0, end);
        

          System.out.println("Roated Array : \n"+Arrays.toString(copyArr));
        }
        
    }
    public static void reverseHelper(int arr[],int start,int end){
        if(arr==null || arr.length==0){
             System.out.println("Array is empty or null");return;
        }
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }


    }

}
