import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=n-2;i>=0;i-=2){
                int difference=arr[i+1]-arr[i];
                if(difference<=k){
                    arr[i]=arr[i+1];
                    k-=difference;
                }
                else{
                    if(k>0){
                        arr[i]+=k;
                        k=0;
                    }
                }
            }
        int as=0,bs=0;
        boolean flag=true;
        for(int i=n-1;i>=0;i--){
            if(flag==true){
             as=as+arr[i];
             flag=false;
            }
            else{
                bs=bs+arr[i];
                flag=true;
            }
        }
        System.out.println(as-bs);
    }
    }
}