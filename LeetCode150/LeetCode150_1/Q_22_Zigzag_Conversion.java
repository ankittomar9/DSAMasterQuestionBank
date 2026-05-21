package LeetCode150.LeetCode150_1;

public class Q_22_Zigzag_Conversion {
    public static void main(String[] args) {
        String s="PAYPALISHIRING"; System.out.println("Original String  : \n"+s);
        int numRows=3; System.out.println("Num Rows  : \n"+numRows);
         System.out.println("ZigZag Result  : \n"+convert(s,numRows));

    }
    public static String convert(String s,int numRows){
        if(s==null || s.isEmpty() || numRows<=1 || numRows>=s.length()){return s;}

        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }

        int row=0;int step=1; // 1=down , -1 = up
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            rows[row].append(c);
            
            if(row==0) step=1;
            else if(row==numRows-1) step=-1;

            row=row+step;
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<numRows;i++){
            result.append(rows[i]);
        }
        return result.toString();

    }

}

