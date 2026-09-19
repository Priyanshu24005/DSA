class RandomizedSet {
    HashMap <Integer,Integer> map = new HashMap<>();
    ArrayList <Integer> list = new ArrayList<>();
    Random rm;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rm = new Random();
    }
    
    public boolean insert(int val) { 
        if(!map.containsKey(val)){
        map.put(val,list.size());
        list.add(val);
        return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
        int ind = map.get(val);//1
        if(ind == list.size()-1){
        list.remove(list.size()-1);
        map.remove(val);

        return true;
        }
        list.set(ind,list.get(list.size()-1));
        list.remove(list.size()-1);
        map.remove(val);
        map.put(list.get(ind),ind);
        return true;
        }
        return false;
    }
    
    public int getRandom() {
        int idx = rm.nextInt(list.size());
        return list.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */