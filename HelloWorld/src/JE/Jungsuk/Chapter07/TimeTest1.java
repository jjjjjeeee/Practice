package JE.Jungsuk.Chapter07;

public class TimeTest1 {
    public static void main(String[] args) {
        Time1 t = new Time1(12,35,30);
        System.out.println(t);
        t.setHour(t.getHour()+1); // 현재보다 1시간 후로 변경
        System.out.println(t);
    }
}

class Time1{
    private int hour, minute, second;

    Time1(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour(){return hour;}
    public void setHour(int hour){
        if (hour<0 || hour>23) return;
        this.hour = hour;
    }

    public int getMinute(){return minute;}
    public void setMinute(int minute){
        if (minute<0 || minute>59) return;
        this.minute = minute;
    }

    public int getSecond(){return second;}
    public void setSecond(int second){
        if (second<0 || second>59) return;
        this.second = second;
    }

    public String toString() {
        return "현재 시간 ===> "+hour+":"+minute+":"+second;
    }
}