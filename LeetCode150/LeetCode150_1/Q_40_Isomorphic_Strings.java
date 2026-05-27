package LeetCode150.LeetCode150_1;

public class Q_40_Isomorphic_Strings {
    public static void main(String[] args) {
         String s1 = "egg";        String t1 = "add";
           System.out.println("Input s : " + s1);
        System.out.println("Input t : " + t1);
        System.out.println("Output  : " + isIsomorphic(s1, t1));

        String s2 = "foo";        String t2 = "bar";
        System.out.println("\nInput s : " + s2);
        System.out.println("Input t : " + t2);
        System.out.println("Output  : " + isIsomorphic(s2, t2));
    }
    public static boolean isIsomorphic(String s ,String t){
        if(s==null || t==null ||s.length() !=t.length()){
            return false;
        }
        int[] mapS=new int[256];
        int[] mapT=new int[256];

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(mapS[c1]!=mapT[c2]){
                return false;
            }
            mapS[c1]=i+1;
            mapT[c2]=i+1;
        }
        return true;
    }
}
