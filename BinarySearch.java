import java.util.*;

public class BinarySearch {

    public static int Binarysearch(int arr[],int n,int target,int start,int end){

    
        if(start>end){
             return -1;
        }
        int  mid=start+(end-start)/2;
        if(target<arr[mid]){
            return Binarysearch(arr,n,target,0,mid-1);
        }
        if(target>arr[mid]){
            return Binarysearch(arr,n,target,mid+1,end);
        }
        if(target==arr[mid]){
            return mid;
        }
        return -1;
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();

        int ans=Binarysearch(arr,n,target,0,arr.length-1);
        System.out.println(ans);
    }
}
