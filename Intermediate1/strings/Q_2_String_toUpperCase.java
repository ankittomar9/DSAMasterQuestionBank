package Intermediate1.strings;

public class Q_2_String_toUpperCase {
    public static void main(String args[]){
        String str="THIS 475IS A UPPER74 CASE$%&STRING ";
         System.out.println("Original String : \n"+str);
         toUpperCaseHelper(str);
    }

    public static void toUpperCaseHelper(String str){
        if(str==null || str.isEmpty()){
            System.out.println("String is empty or null");return;}
   
            char[] arr=str.toCharArray();

            for(int i=0;i<str.length();i++){

                if(arr[i]>='A' && arr[i]<='Z'){
                    arr[i]=(char)(arr[i]+32);
                }
            }
            String str2=new String(arr);

            System.out.println("Converted String : \n"+str2);

    }
}
