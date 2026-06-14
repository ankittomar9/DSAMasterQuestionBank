package LeetCode150.LeetCode150_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Q_96_Minimum_Genetic_Mutation {
    public static void main(String[] args) {
         String startGene = "AACCGGTT";  String endGene = "AACCGGTA";  String[] bank = {"AACCGGTA"};

        System.out.println("startGene : " + startGene);
        System.out.println("endGene   : " + endGene);
        System.out.println("bank      : " + Arrays.toString(bank));
        System.out.println("Minimum Mutations: " + minMutation(startGene, endGene, bank));
    }
    public static int minMutation(String startGene,String endGene,String[] bank){
        Set<String> bankSet=new HashSet<>(Arrays.asList(bank));
        if(!bankSet.contains(endGene)) return -1;

        char[] chars={'A','C','G','T'};
        Queue<String> queue=new LinkedList<>();
        Set<String> visited =new HashSet<>();

        queue.offer(startGene); visited.add(startGene); int mutations=0;

        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String current=queue.poll();
                if(current.equals(endGene)){
                    return mutations;
                }

                 char[] geneArray=current.toCharArray();
                 for(int j=0;j<8;j++){
                    char original=geneArray[j];
                    for(char c:chars){
                        if(c== original)continue;
                        geneArray[j]=c;
                        String nextGene =new String(geneArray);
                        if(!visited.contains(nextGene) && bankSet.contains(nextGene)){
                            visited.add(nextGene);
                            queue.offer(nextGene);
                        }
                    }
                    geneArray[j]=original;
                 }
            }
            mutations++;
        }
        return -1;

    }
}
