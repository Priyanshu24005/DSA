class Solution {
    public static boolean isValid(int[] arr,long mid,int m,int k){
        int fl = 0;
        int bq = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]<=mid){
                fl++;
            }else fl = 0;

            if(fl == k){
                bq++;
                fl = 0;
            }
        }
        return bq>=m;

    }



    public static int minDays(int[] bloomDay, int m, int k) {

        long f = bloomDay[0];
        long l = 0;
        long ans = -1;

        for(int i = 0;i<bloomDay.length;i++){
            f = Math.min(bloomDay[i],f);
            l = Math.max(bloomDay[i],l);
        }

        while(f<=l){
            long mid = f+(l-f)/2;

            if(isValid(bloomDay,mid,m,k)){
                ans = mid;
                l = mid-1;
            }else f = mid+1;
        }

        return (int)ans;
    }
}