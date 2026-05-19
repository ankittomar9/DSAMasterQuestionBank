package LeetCode150.LeetCode150_1;
public class Q_13_Gas_Station {
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};System.out.println("Gas  : " + java.util.Arrays.toString(gas));
        int[] cost={3,4,5,1,2};  System.out.println("Cost : " + java.util.Arrays.toString(cost));
         
        int start = canCompleteCircuit(gas, cost);
        System.out.println("Starting Index : " + start);
    }
    public static int canCompleteCircuit(int[] gas,int[] cost){
        if(gas==null || cost==null || gas.length==0 || cost.length==0){return 0;}
        int n=gas.length;
        int total=0; int current=0;int start=0;

        for(int i=0;i<n;i++){
            int net= gas[i]-cost[i];
            total=total+net;
            current=current+net;
            
            if(current<0){
                start=i+1;
                current=0;
            }
        }
        int result=0;
        if(total>=0){
            result=start;
        }else{
            result=-1;
        }
        return  result;
    }
}
