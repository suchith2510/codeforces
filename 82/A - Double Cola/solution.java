import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        String [] arr={
            "Sheldon","Leonard","Penny","Rajesh","Howard"
        };
        int groupSize=1;
        while(n>5*groupSize){
            n=n-(groupSize*5);
            groupSize*=2;
        }
        int ans=(int)((n-1)/groupSize);
        System.out.println(arr[ans]);
    }
}