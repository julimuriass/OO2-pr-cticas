package ar.edu.unlp.info.oo1;

import java.time.Duration;

public class Paused extends State {

    public void start(ToDoItem item) {}

    public void togglePause(ToDoItem item) {
        item.iniciarContador();
        item.changeState(new InProgress());
    }

    public void finish(ToDoItem item) {
        item.changeState(new Finished());
    }
    
    public Duration duration(ToDoItem toDoItem) {
        return toDoItem.getAcumulado();
    }
}
