package Tut1.Exersice2;

public class Counter {
    int count;
    /**
     * @effects Makes this contain 0
     */
    public Counter() {
        this.count = 0;
    }
    /**
     *
     * @effects Returns the value of this
     */
    public int get() {
        return count;
    }

    /**
     * @modifies this
     * @effects Increments the value of this
     */
    public void incr(){
        count++;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.incr();
        counter.incr();
        counter.incr();

        System.out.println(counter.get());
    }
}
