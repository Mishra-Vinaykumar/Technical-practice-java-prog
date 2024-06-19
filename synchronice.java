
class Counter {
    private int cnt;

    public synchronized void increment() {
        cnt = cnt + 1;
    }

    public int getCount() {
        return cnt;
    }
}

public class synchronice {

    public static void main(String[] args) {
        Counter c = new Counter();

        Thread t = Thread();

        c.increment();
        c.getCount();
    }
}
