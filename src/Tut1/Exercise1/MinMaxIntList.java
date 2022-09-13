package Tut1.Exercise1;

import java.util.ArrayList;

public class MinMaxIntList extends ArrayList {

    public Integer min() {
        if (repOk()){
            Integer n = (Integer) this.get(0);
            for (int i = 0; i < this.size(); i++){
                if ((Integer) this.get(i) < n) {
                    n = (Integer) this.get(i);
                }
            }
            return n;
        }
        return null;
    }

    public Integer max() {
        if (repOk()){
            Integer n = (Integer) this.get(0);
            for (int i = 0; i < this.size(); i++){
                if ((Integer) this.get(i) > n) {
                    n = (Integer) this.get(i);
                }
            }
            return n;
        }
        return null;
    }

    public boolean repOk () {
        if (this.size() > 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MinMaxIntList m = new MinMaxIntList();
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(5);

        System.out.println(m.min());
        System.out.println(m.max());

    }
}
