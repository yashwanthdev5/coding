package OOPs;

 interface playable {
    // variables are final and static
    // methoda are public abstaract
    void play();
}
class Cricket implements playable  {

     public void play()
     {
        System.out.println("Cricket is playing ");
     }
}
class Football implements playable{
     public void play()
     {
        System.out.println("playing football");
     }
}
public class Interfaces {
    public static void main(String[] args) {
        playable a;
        a=new Cricket();
        a.play();
        a=new Football();
        a.play();
    }
}
