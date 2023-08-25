import java.util.*;

public class MaxSubarrays {
 
    public static int  MaxSum(int arr[],int n){

        int currsum=0;
        int maxsum=0;
        

        for(int i=0;i<n;i++){
            currsum=currsum+arr[i];

        
        if(currsum>maxsum){
            maxsum=currsum;
        }
        if(currsum<0){
            currsum=0;
        }
    }
    

        return maxsum;
    }
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans=MaxSum(arr,n);
       
        System.out.println(ans);
        }


    }

