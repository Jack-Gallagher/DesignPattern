package behavioralPatterns.tamplatePattern;

public abstract class HummerModel {
   public abstract void start();
   public abstract void stop();
   public abstract void engineBoom();
   public void run(){
      this.start();
      this.engineBoom();
      this.stop();
   }

}
