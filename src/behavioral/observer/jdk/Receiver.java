package behavioral.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Receiver implements Observer{

    @Override
    public void update(Observable o, Object arg) {
       System.out.println("fetch msg : " + ((Dispatcher)o).getContent());
       System.out.println("pull msg: " + arg);
    }

}
