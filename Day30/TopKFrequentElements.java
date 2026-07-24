import java.util.*;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq =
                new PriorityQueue<>((a,b)->a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){

            pq.offer(entry);

            if(pq.size()>k){
                pq.poll();
            }
        }

        int[] result = new int[k];

        for(int i=k-1;i>=0;i--){
            result[i]=pq.poll().getKey();
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums={1,1,1,2,2,3};
        int k=2;

        int[] ans=topKFrequent(nums,k);

        System.out.println("Top K Frequent Elements:");

        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}