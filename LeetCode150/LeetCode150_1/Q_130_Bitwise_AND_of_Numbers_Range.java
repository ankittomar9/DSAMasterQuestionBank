package LeetCode150.LeetCode150_1;

public class Q_130_Bitwise_AND_of_Numbers_Range {
    public static void main(String[] args) {

  System.out.println("left = 5 and right= 7 \n Result:  "+rangeBitwiseAnd(5, 7));   // 4
        System.out.println("left = 0 and right= 0 \n Result:  "+rangeBitwiseAnd(0, 0));   // 0
        System.out.println("left = 1 and right= 2147483647 \n Result:  "+rangeBitwiseAnd(1, 2147483647)); // 0
    }

    public static int rangeBitwiseAnd(int left,int right){
        int shift=0;

        while(left<right){
            left=left>>1;
            right=right>>1;
            shift++;
        }
        int result=left<<shift;
        return result;
    }
}
