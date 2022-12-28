package ex006.compomentes;

import java.util.ArrayList;

public class TextEditor {
    
    ArrayList<Line> lines;
    EventManager events;
    
    public TextEditor() {
        this.lines = new ArrayList<>();
        events = new EventManager("open", "save", "writing", "remove");
    }

    public void insertLine(int lineNumber, String text) {
        Line line = new Line(text);
        events.subscribe("writing", line);
        if (lineNumber > lines.size()) {
            lines.add(line);
        } else {
            lines.add(lineNumber, line);
        }

    }

    public void removeLine(int lineNumber) {
        events.unsubscribe("remove", lines.remove(lineNumber));
    }

    public void saveFile() {
        events.notify("save", lines);
        for (Line line: this.lines) {
            System.out.println(line.toString());
        }
    }

}
