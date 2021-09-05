import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String str=s.next();
        
        char a[]={'A','B','C'};
        char b[]={'B','A','B','C'};
        char g[]={'C','C','A','A','B','B'};

        int ind1=0;
        int count1=0;

        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==a[ind1]){
                count1++;
            
            }
            ind1++;
            if (ind1==a.length){
                ind1=0;

            }
        }

        int ind2=0;
        int count2=0;
        
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==a[ind2]){
                count2++;
            
            }
            ind2++;
            if (ind2==a.length){
                ind2=0;

            }
        }

        int ind3=0;
        int count3=0;

        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==a[ind3]){
                count3++;
            
            }
            ind3++;
            if (ind3==a.length){
                ind3=0;

            }
        }
        int max=Math.max(count1,Math.max(count2, count3));
        System.out.println(max);
        if (count1==max){
            System.out.println("A");
        }
        if (count2==max){
            System.out.println("B");
        }
        if (count3==max){
            System.out.println("G");
        }
    }
    
}
