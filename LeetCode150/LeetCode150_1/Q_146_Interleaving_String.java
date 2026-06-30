package LeetCode150.LeetCode150_1;

public class Q_146_Interleaving_String {
    public static void main(String[] args) {
         String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        System.out.println("s1 = \"" + s1 + "\", s2 = \"" + s2 + "\", s3 = \"" + s3 + "\"");
        System.out.println("Can Interleave: " + isInterleave(s1, s2, s3));

        s3 = "aadbbbaccc";
        System.out.println("\ns3 = \"" + s3 + "\"");
        System.out.println("Can Interleave: " + isInterleave(s1, s2, s3));
    }
    public static boolean isInterleave(String s1,String s2,String s3){
        int m=s1.length(),n=s2.length();
        if(m+n!=s3.length()) return false;

        boolean[][] dp=new boolean[m+1][n+1];
        dp[0][0]=true;
    
        for(int j=1;j<=n;j++){
            dp[0][j]=dp[0][j-1] && s2.charAt(j-1)==s3.charAt(j-1);
        }

        for(int i=1;i<=m;i++){
            dp[i][0]=dp[i-1][0] && s1.charAt(i-1) ==s3.charAt(i-1);
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]=(dp[i-1][j] && s1.charAt(i-1) ==s3.charAt(i+j-1)) ||
                (dp[i][j-1] && s2.charAt(j-1) ==s3.charAt(i+j-1));
            }
        }
        return dp[m][n];
    }
}
