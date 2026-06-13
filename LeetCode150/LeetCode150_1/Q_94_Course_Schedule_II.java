package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q_94_Course_Schedule_II {
    public static void main(String[] args) {
        
    }
    public static int[] findOrder(int numCourses,int[][] prerequisites){
        List<List>adj=new ArrayList<>();
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
