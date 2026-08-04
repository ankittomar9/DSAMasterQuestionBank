package LeetCodeAll.arrays;

public class Q_115_Maximum_Product_Word_Lengths {
    public static void main(String[] args) {
        // Test 1
        String[] words1 = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        System.out.println("words = [abcw, baz, foo, bar, xtfn, abcdef]");
        System.out.println("Result: " + maxProduct(words1)); // 16

        // Test 2
        System.out.println();
        String[] words2 = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        System.out.println("words = [a, ab, abc, d, cd, bcd, abcd]");
        System.out.println("Result: " + maxProduct(words2)); // 4

        // Test 3: all share letters
        System.out.println();
        String[] words3 = {"a", "aa", "aaa", "aaaa"};
        System.out.println("words = [a, aa, aaa, aaaa]");
        System.out.println("Result: " + maxProduct(words3)); // 0  
    }
    public static int maxProduct(String[] words){
        int n=words.length; 
        int[] masks=new int[n];
        for(int i=0;i<n;i++){
            int mask=0;
            for(char c: words[i].toCharArray()){
                mask |= 1<<(c-'a');
            }
            masks[i]=mask;
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if((masks[i] & masks[j])==0){
                    int product=words[i].length() * words[j].length();
                    if(product > max){
                        max=product;
                    }
                }
            }
        }
        return max;
    }
}
