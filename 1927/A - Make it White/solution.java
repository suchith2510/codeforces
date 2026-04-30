import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            boolean flag=true;
            int fdx=-1,ldx=-1;
            char[] arr=new char[n];
            String str=sc.next();
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='B'&&flag==true){
                    fdx=i;
                    flag=false;
                }
                if(str.charAt(i)=='B'){
                    ldx=i;
                }
            }
            int count=0;
            for(int i=fdx;i<=ldx;i++){
                count++;
            }
            System.out.println(count);
        }
    }
}