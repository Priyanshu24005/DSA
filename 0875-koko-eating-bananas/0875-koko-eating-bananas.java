class Solution {
 public boolean isValid(int[] piles,long speed,int h){
        long total = 0;

        for(int i = 0;i<piles.length;i++){
            if(piles[i]%speed==0){
                total += piles[i]/speed;
            }else{
                total += (piles[i]/speed) + 1;
            }
        }
        return total <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
long f = 1;
        long l = 0;
        long ans = -1;

        for(int i = 0;i<piles.length;i++){
            l = Math.max(l,piles[i]);
        }

        while(f<=l){
            long speed = f + (l-f)/2;
            if(isValid(piles,speed,h)){
                ans = speed;
                l = speed-1;
            }else f = speed+1;
            
        }

        return (int)ans;
    }
}