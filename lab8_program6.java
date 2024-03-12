abstract class phone{
    abstract void call();
    abstract void msg();
}
interface Camera{
    void click();
    void record();
}
interface MusicPlayer{
    void play();
    void pause();
    void stop();
}
class SmartPhone extends phone implements Camera,MusicPlayer{
    void call(){
        System.out.println("calling");
    }
    void msg(){
        System.out.println("messaging");
    }
    public void click(){
        System.out.println("click photo");
    }
    public void record(){
        System.out.println("record video");
    }
    public void play(){
        System.out.println("play music");
    }
    public void pause(){
        System.out.println("pause music");
    }
    public void stop(){
        System.out.println("stop music");
    }
    
}
public class lab8_program6 {
    public static void main(String args[]){
        SmartPhone mi = new SmartPhone();
        phone p = mi;
        p.msg();
        p.call();
        Camera c= mi;
        c.click();
        c.record();
        MusicPlayer m = mi;
        m.play();
        m.pause();
        m.stop();
    }
}
