package Intermediate1.strings;

public class Q_1_Strings_toLowerCase {
    public static void main(String args[]){
        String str="ANKUR09 IS HMI DEVELOPER1809";
         System.out.println("Original String : \n"+str);
         toLowerCaseHelper(str);

    }
    public static void toLowerCaseHelper(String str){
        if(str==null || str.isEmpty()){
            System.out.println("String is empty or null");return;}
   
            char arr[]=str.toCharArray();

            for(int i=0;i<str.length();i++){
                if(arr[i]>='A' && arr[i]<='Z'){
                    arr[i]=(char)(arr[i]+32);
                }
            }
            String str2=new String(arr);
            System.out.println("Converted String : \n"+str2);
        }
    
}
