import java.util.Scanner;
public class autori {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String str=s.next();
        String ans="";

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch>='A' && ch<='Z'){
                ans=ans+ch;
            
            }
        }  System.out.println(ans);
    }
}
