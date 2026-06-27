package LeetCode150.LeetCode150_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q_136_Max_Points_on_a_Line {
    public static void main(String[] args) {
        int[][] points1 = {{1,1},{2,2},{3,3}};          System.out.println("\nInput: " +Arrays.deepToString(points1));
        System.out.println("Max Points on a Line: " + maxPoints(points1));

        int[][] points2 = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        System.out.println("\nInput: " +Arrays.deepToString(points2));
        System.out.println("Max Points on a Line: " + maxPoints(points2)); 
    }
    public static int maxPoints(int[][] points){
        if(points.length<=2){return points.length;}
        int maxPoints=0;
    
        for(int i=0;i<points.length;i++){
            Map<String,Integer> slopeCount=new HashMap<>();
            int duplicates=1; int localMax=0;
        
            for(int j=i+1;j<points.length;j++){
                int dx=points[j][0]-points[i][0];
                int dy=points[j][1]-points[i][1];

                if(dx==0 && dy==0){
                    duplicates++; 
                    continue;
                }
                int gcd=gcd(dx,dy);
                dx=dx/gcd;
                dy=dy/gcd;

                if(dx<0){
                    dx=-dx; 
                    dy=-dy;
                }else if(dx==0 && dy<0){
                    dy=-dy;
                }

                String key=dx + "/"+ dy;
              slopeCount.put(key, slopeCount.getOrDefault(key, 0) + 1);
        
                localMax=Math.max(localMax, slopeCount.get(key));
            }
            maxPoints=Math.max(maxPoints, localMax+duplicates);
        }
        return maxPoints;
    }
    private static int gcd(int a,int b){
        return b==0 ? a: gcd(b,a%b);
    }

}
