import com.heap.*;
import java.util.*;
public class Implementation{

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Heap minHeap = new MinHeap();
        Heap maxHeap = new MaxHeap();
        
        int n = in.nextInt();
        int[] a = new int[n];
        double eff_median=0;
        for(int a_i=1; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            eff_median = a[a_i];
            
            if(minHeap.isEmpty() && maxHeap.isEmpty()){
                maxHeap.add(a[a_i]);
                eff_median = maxHeap.peek();
            }else{
                if(a_i%2 != 0){
                    
                        minHeap.add(a[a_i]);
                    
                    
                }else{
                    if(minHeap.isEmpty() == false && minHeap.peek()>maxHeap.peek()){
                        int temp = minHeap.extractTop();
                        maxHeap.add(temp);
                        minHeap.add(a[a_i]);
                    }
                    
                }
                
                if(minHeap.size()>maxHeap.size()){
                    eff_median = minHeap.peek();
                }else if(minHeap.size<maxHeap.size()){
                    eff_median = maxHeap.peek();
                }else{
                    eff_median = (minHeap.peek()+maxHeap.peek())/2;
                }
            }
            System.out.println(eff_median);
        }
    }
}