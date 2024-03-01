public class Time implements Comparable<Time> {

    public Time(){
        hour = 0;
        minute = 0;
        second = 0;
    }
    public Time(int h,int m,int s){
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    private int second;
    private int minute;
    private int hour;

    public void setSecond(int second){
        this.second = second;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setHour(int hour){
        this.hour = hour;
    }


    public int getSecond(){
        return second;
    }
    public int getMinute(){
        return minute;
    }
    public int getHour(){
        return hour;
    }


    @Override
    public String toString(){
        return "[ " + hour + " : " + minute + " : " + second + " ]";
    }


    @Override
    public int compareTo(Time other) {

        if(this.hour > other.hour)
            return 1;
        else if(this.hour < other.hour)
            return -1;
        else if(this.minute > other.minute)
            return 1;
        else if(this.minute < other.minute)
            return -1;
        else if(this.second > other.second)
            return 1;
        else if(this.second < other.second)
            return -1;

        System.out.println("There are multiple :" + other);

        return 0;
    }
}
