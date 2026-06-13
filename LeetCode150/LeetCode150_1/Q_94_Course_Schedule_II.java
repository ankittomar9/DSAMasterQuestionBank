package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q_94_Course_Schedule_II {
    public static void main(String[] args) {
        int numCourses1 = 2;        int[][] prerequisites1 = {{1, 0}};
        int numCourses2 = 4;        int[][] prerequisites2 = {{1,0},{2,0},{3,1},{3,2}};

        System.out.println("numCourses   : " + numCourses1);
        System.out.println("Prerequisites: " + Arrays.deepToString(prerequisites1));
        System.out.println("Order        : " + Arrays.toString(findOrder(numCourses1, prerequisites1)));

        System.out.println("\nnumCourses   : " + numCourses2);
        System.out.println("Prerequisites: " + Arrays.deepToString(prerequisites2));
        System.out.println("Order        : " + Arrays.toString(findOrder(numCourses2, prerequisites2)));
    }
    public static int[] findOrder(int numCourses,int[][] prerequisites){
        List<List<Integer>>adj=new ArrayList<>();
        int[] inDegree=new int[numCourses];

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] pre:prerequisites){
            int course=pre[0];
            int prerequisite=pre[1];
            adj.get(prerequisite).add(course);
            inDegree[course]++;
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0){
                queue.offer(i);
            }
        }
        int[] order=new int[numCourses];
        int index=0;

        while(!queue.isEmpty()){
            int course=queue.poll();
            order[index++]=course;
            
            for(int next : adj.get(course)){
                inDegree[next]--;
                if(inDegree[next]==0){
                    queue.offer(next);
                }
            }
        }
        if(index ==numCourses){
            return order;
        }else{
            return new int[0];
        }
        
    }
}
