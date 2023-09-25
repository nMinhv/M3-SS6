package bt.bt3;

public class StopWatch {
private long startTime,endTime,elapsedTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public  void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop () {
        this.endTime = System.currentTimeMillis();
    }
    public  void elapsedTime () {
         this.elapsedTime = this.endTime - this.startTime;
        System.out.println("time elapsed: " + this.elapsedTime);
    }
}
