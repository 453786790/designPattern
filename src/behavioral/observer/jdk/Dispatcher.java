package behavioral.observer.jdk;

import java.util.Observable;

public class Dispatcher extends Observable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        this.notifyObservers(content);
        this.notifyObservers();
    }
}
