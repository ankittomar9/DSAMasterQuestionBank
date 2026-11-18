package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_128_Russian_Doll_Envelopes {
    public static void main(String[] args) {
         int[][] env1 = {{5,4},{6,4},{6,7},{2,3}};        System.out.println("env1=" + Arrays.deepToString(env1));
        System.out.println("Result: " + maxEnvelopes(env1)); // 3
        // Test 2: duplicates
        System.out.println();        int[][] env2 = {{1,1},{1,1},{1,1}};
        System.out.println("env2=" + Arrays.deepToString(env2));        System.out.println("Result: " + maxEnvelopes(env2)); // 1
        // Test 3: chain of 4
        System.out.println();        int[][] env3 = {{4,5},{4,6},{6,7},{2,3},{1,1}};
        System.out.println("env3=" + Arrays.deepToString(env3));  System.out.println("Result: " + maxEnvelopes(env3)); // 4 ([1,1]->[2,3]->[4,5]->[6,7])
    }
    public static int  maxEnvelopes(int[][] envelopes){
        if(envelopes==null || envelopes.length==0){return 0;}
        Arrays.sort(
            envelopes,(a,b) -> { if(a[0] !=b[0]) return a[0]-b[0];
                return b[1]-a[1];});
    
                int[] tails=new int[envelopes.length];
                int len=0;

                for(int[] env : envelopes){
                    int h=env[1];
                    int index=Arrays.binarySearch(tails,0,len,h);
                    if(index<0){
                        index=-(index+1);
                    }
                    tails[index]=h;
                    if(index==len) len++;
                }
                return len;
            }            
}
