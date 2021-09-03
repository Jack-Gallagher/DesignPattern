package tamplatePattern.hookTamplate;

public class Hummer1 extends HummerMode{
    private boolean alarmFlag = true;
    @Override
    protected void start() {
        System.out.println("start");
    }

    @Override
    protected void stop() {
        System.out.println("stop");
    }

    @Override
    protected void alarm() {
        System.out.println("alarm");
    }

    @Override
    protected void enginBoom() {
        System.out.println("engine");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean isAlarm){
      this.alarmFlag = isAlarm;
    }
}
