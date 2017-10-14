import java.util.*;

class Merge{

public static int count=0;
    public static void main(String args[]){
        
        int[] a = {2,1,3,1,2};
        
        print(a);
        a=MergeSort(a);
        print(a);
        System.out.println(count);
    }
    public static void print(int[] a){
        System.out.println("Array");
        for(int i:a){
            System.out.print(i+"\t");
        }
    }

    public static int[] MergeSort(int[] a){
        return MergeSort(a,0,a.length-1);
    }

    public static int[] MergeSort(int[] a, int left, int right){
        if(left<right){
            int middle = left+ (right-left)/2;
            a = MergeSort(a,left,middle);
            
            a = MergeSort(a,middle+1,right);
            
            a = Combine(a,left,middle,right);
            print(a);
        }
        return a;
    }

    public static int[] Combine(int[] a, int left,int middle, int right){

        int[] b = new int[a.length];
        int i=left, k=left;
        int j=middle+1;
        while(i<=middle && j<=right){
            //System.out.println(a[i]+","+a[j]);
            if(a[i]<=a[j])
            {
                //System.out.println("\n"+a[i]+","+a[j]);
                b[k++]=a[i++];
            }
                
            else{System.out.println("\n"+a[i]+","+a[j]);
                b[k++]=a[j++];
                
                count++;
            }
                
        }

        while(i<=middle){
            b[k++]=a[i++];
        }
        while(j<=right){
            b[k++]=a[j++];
        }
        for(int a_i=left;a_i<=right;a_i++){
            a[a_i]=b[a_i];
        }
        return a;

        
    }
}