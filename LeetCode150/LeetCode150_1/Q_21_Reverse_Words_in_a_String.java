package LeetCode150.LeetCode150_1;
public class Q_21_Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String s1="the sky is blue ";
        System.out.println("Original String  : \n"+s1);

        char[] arr=s1.toCharArray();
        int start=0;int end=arr.length-1;
        reverse(arr,start,end);

        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                reverse(arr,start,i-1);
                start=i+1;
            }else if(i==end){
                reverse(arr,start,end);
            }
        }

        String str2=new String(arr);
        System.out.println("Reverse Words  : \n"+str2);

    }
    public static void reverse(char[] arr ,int start,int end){
        if(arr==null || arr.length==0){
            return ;
        }
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}
