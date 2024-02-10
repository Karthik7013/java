
public class Clock {
    private int hrs;
    private int min;
    private int sec;

    Clock(int hrs, int min, int sec) {
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }

    public void dispalyTime() {
        System.out.println(this.hrs + ":" + this.min + ":" + this.sec);
    }

    // setter methods => initialises non static memebers
    public void setTime(int hrs, int min, int sec) {
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }

    // getter methods => get the non static members value

    public int getHrs() {
        return this.hrs;
    }

    public int getMin() {
        return this.min;
    }

    public int getSec() {
        return this.sec;
    }

}
