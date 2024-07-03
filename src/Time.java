class Time {
    int hr;
    int min;
    int sec;

    public Time() {
        this.hr = 0;
        this.min = 0;
        this.sec = 0;
    }

    public Time(int hr, int min, int sec) {
        if (hr >= 0 && hr < 24) {
            this.hr = hr;
        } else {
            this.hr = 0;
        }

        if (min >= 0 && min < 60) {
            this.min = min;
        } else {
            this.min = 0;
        }

        if (sec >= 0 && sec < 60) {
            this.sec = sec;
        } else {
            this.sec = 0;
        }
    }

    public void displayTime() {
        System.out.println("Time: " + this.hr + ":" + this.min + ":" + this.sec);
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(13, 45, 30);

        t1.displayTime();
        t2.displayTime();
    }
}
