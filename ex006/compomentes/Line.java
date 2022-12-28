package ex006.compomentes;

import java.util.ArrayList;

public class Line implements EventListener {

    private String text;

    private String event;

    public Line(String text) {
        this.text = text;
        this.event = "open";
    } 

    @Override
    public void update(String eventType, ArrayList<Line> file) {
        this.event = eventType;
    }

    @Override
    public String toString() {
       return text;
    }
}


