package ar.edu.unlp.info.oo1;

import java.time.Duration;

public class Finished extends State {

    public void start(ToDoItem item) {}

    public void togglePause(ToDoItem item) {
        throw new RuntimeException("ALERTA toggle pause en Finished!");
    }

    public void finish(ToDoItem item) {}

    public Duration duration(ToDoItem toDoItem) {
        return toDoItem.getAcumulado();
    }

}
