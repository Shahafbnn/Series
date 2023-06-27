public class MyHashMap {
    //this is my interpretation of the basic implementation of a hashmap.
    private int m;
    private int n;
    private Integer[] map;

    private int expandNum;
    private int expandMult;


    public MyHashMap(int m) {
        this.m = m;
        this.n = 0;
        this.expandNum = m;
        this.expandMult = 1;
        this.map = new Integer[m];
        for(Integer i : map) i = null;
    }

    public MyHashMap(int m, int expandMult) {
        this.m = m;
        this.n = 0;
        this.expandNum = m;
        this.expandMult = expandMult;
        this.map = new Integer[m];
        for(Integer i : map) i = null;
    }

    //copy constructor
    public MyHashMap(MyHashMap other) {
        this.m = other.m;
        this.n = other.n;
        this.expandNum = other.expandNum;
        this.map = new Integer[m];
        //copying the array.
        for(int i = 0; i < m; i++){
            this.map[i] = other.map[i];
        }
    }

    public int getExpandNum() {
        return expandNum;
    }

    public int getExpandMult() {
        return expandMult;
    }

    public void setExpandNum(int expandNum) {
        this.expandNum = expandNum;
    }

    public void setExpandMult(int expandMult) {
        this.expandMult = expandMult;
    }

    private boolean isFull(){
        return n/m >= 1;
    }

    private void expand(int multiplier){
        Integer[] retMap = new Integer[m + expandNum * multiplier];
        int i = 0;
        for(; i < this.map.length; i++){
            retMap[i] = this.map[i];
        }
        for(; i < retMap.length; i++){
            retMap[i] = null;
        }
    }
    private int hash(int x){
        if(x > 0) return x;
        return -1;
    }
    public boolean put(int x){
        int i = hash(x);
        if(i >= 0 && i <= m) {
            if(map[i] != null) return false;
            if(isFull()){
                expand(expandMult);
            }
            map[i] = x;
        }
        return false;
    }

    // just a thunk func for put
    public boolean insert(int x){
        return put(x);
    }
    public int get(int x){
        return map[hash(x)];
    }
}
