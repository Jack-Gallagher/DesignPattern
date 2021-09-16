package behavioralPatterns.tamplatePattern.hookTamplate;

public abstract class HummerMode {
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void enginBoom();

    final public void run (){
        this.start();
        this.enginBoom();
        if (this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }

    protected boolean isAlarm() {
        return true;
    }
}
