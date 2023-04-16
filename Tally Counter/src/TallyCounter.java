/**
 * TallyCounter
 */
public class TallyCounter {
    private int counter;
    private int digits;
    

    public TallyCounter() {
        counter = 0;
        digits = 3;
    }

    public TallyCounter(int digits) {
        counter = 0;
        if (digits < 3) {
            this.digits = 3;
        } else {
            this.digits = digits;
        }
    }

    public String toString() {
        String strCounter = Integer.toString(counter);
        int length = strCounter.length();
        int zeros = digits - length;
        String str = "";
        for (int i = 0; i<zeros; i++) {
            str += "0";
        }
        str += strCounter;
        return str;
    }

    public void increment() {
        int maximum = 0;
        int add = 9;
        for (int i = 0; i < digits; i ++) {
            maximum += add;
            add *= 10;
        }
        if (counter == maximum) {
            counter = 0;
        } else {
            counter += 1;
        }
        
    }

    public int read() {
        return counter;
    }

    public void reset() {
        counter = 0;
    }

    public void decrement() {
        if (counter == 0) {
            counter = 0;
        } else {
            counter -=1;
        }
    }
  
}