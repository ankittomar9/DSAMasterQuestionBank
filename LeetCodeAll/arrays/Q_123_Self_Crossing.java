package LeetCodeAll.arrays;
import java.util.Arrays;
public class Q_123_Self_Crossing {
    public static void main(String[] args) {
    int[] d1 = {2, 1, 1, 2};System.out.println(Arrays.toString(d1) + " → " + isSelfCrossing(d1)); // true
    int[] d2 = {1, 2, 3, 4}; System.out.println(Arrays.toString(d2) + " → " + isSelfCrossing(d2)); // false
    int[] d3 = {1, 1, 1, 2, 1};System.out.println(Arrays.toString(d3) + " → " + isSelfCrossing(d3)); // true
    int[] d4 = {1, 1, 2, 1, 1};System.out.println(Arrays.toString(d4) + " → " + isSelfCrossing(d4)); // true
    int[] d5 = {3, 3, 4, 2, 2}; System.out.println(Arrays.toString(d5) + " → " + isSelfCrossing(d5)); // false
    int[] d6 = {1, 2, 3, 4, 5, 6, 7, 8}; System.out.println(Arrays.toString(d6) + " → " + isSelfCrossing(d6)); // false

        int[] d7 = {1, 1, 1, 1};System.out.println(Arrays.toString(d7) + " → " + isSelfCrossing(d7)); // true   
    }
    public static boolean isSelfCrossing(int[] d){
        int n=d.length;
        for(int i=3;i<n;i++){
        
            if(d[i] >=d[i-2] && d[i-1] <= d[i-3] ) return true;
        
               if(i>=4 && d[i-1] == d[i-3] && d[i] + d[i-4] >=d[i-2] ) return true;
        
                if(i>=5
                    && d[i-2] >=d[i-4]
                    && d[i-1] <=d[i-3]
                    && d[i-1] + d[i-5]  >=d[i-3]
                    && d[i] + d[i-4] >=d[i-2]) return true;
                
            }
            return false;
    }
}
