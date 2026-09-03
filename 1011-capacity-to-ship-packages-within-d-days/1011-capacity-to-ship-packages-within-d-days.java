class Solution {
        public boolean isValid(int[] weights,long mid,int days){
        int count = 1;
        long sum = 0;
        for(int i = 0;i<weights.length;i++){
  if(weights[i]+sum>mid){
            count++;
            sum = weights[i];
        }else{
            sum += weights[i];
        }
        }
      
        return count <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
         long f = weights[0];
        long l = 0;
        long ans = -1;
        
        for(int i = 0;i<weights.length;i++){
            f = Math.max(weights[i],f);
            l += weights[i];
        }

        while(f<=l){
            long mid = f+(l-f)/2;

            if(isValid(weights,mid,days)){
                ans = mid;
                l = mid-1;
            }else{
                f = mid +1;
            }
        }
        return (int)ans;
    }
}