https://leetcode.com/problems/design-bitset
class Bitset {
    private int size;
    private int n;
    private StringBuffer sb1;
    private StringBuffer sb2;
    private StringBuffer temp;
    private int temp2;
    private int noOfOnesInS1;
    private int noOfOnesInS2;
    private boolean flip;

    public Bitset(int size) {
        this.size = size;
        sb1 = new StringBuffer(); sb2 = new StringBuffer();
        for(int i = 0 ; i < size ; i++) {
            sb1.append("0");
            sb2.append("1");
        }
        noOfOnesInS1 = 0;
        noOfOnesInS2 = size; // Mistake , didnt init
    }
    
    public void fix(int i) {
        if(flip) swap();
        if(sb1.toString().charAt(i) == '0') {   // Mistake : '0' and not 0
            ++noOfOnesInS1;
            --noOfOnesInS2;
            sb1.setCharAt(i , '1'); // sb.setCharAt(i,'x') , sb.toString().charAt(i)
            sb2.setCharAt(i , '0');
        }
    }
    
    public void unfix(int i) {
        if(flip) swap();
        if(sb1.toString().charAt(i) == '1') {   // Mistake : '1' and not 1
            --noOfOnesInS1;
            ++noOfOnesInS2;
            sb1.setCharAt(i , '0');
            sb2.setCharAt(i , '1');
        }
    }
    
    public void flip() {
        if(!flip)   flip = true;
        else    flip = false;
    }
    
    public boolean all() {
        if(flip) return noOfOnesInS2 == size;
        return noOfOnesInS1 == size;
    }
    
    public boolean one() {
        if(flip) return noOfOnesInS2 >= 1;
        return noOfOnesInS1 >= 1;
    }
    
    public int count() {
        if(flip) return noOfOnesInS2;
        return noOfOnesInS1;
    }
    
    public String toString() {
        if(flip) return sb2.toString();
        return sb1.toString();
    }
    
    public void swap() {
        temp = sb1;
        sb1 = sb2;
        sb2 = temp;
        temp2 = noOfOnesInS1;
        noOfOnesInS1 =  noOfOnesInS2;
        noOfOnesInS2 = temp2;
        flip = false;
    }
    
    // n = (1 << (n-i-1)) | n;     // set ith bit from ith from left => set (n-i-1)th from right
    // n = n & ~(1 << (n-i-1));          // unset ith bit from ith from left => set (n-i-1)th from right
}

/**
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */