package ar.edu.unlp.info.oo1;

import java.time.Duration;

public class Pending extends State {
    
    public void start(ToDoItem item) {
        item.iniciarContador();
        item.changeState(new InProgress());
    }

    public void togglePause(ToDoItem item) {
        throw new RuntimeException("ALERTA toggle pause en Pending!");
    }

    public void finish(ToDoItem item) {}

    public Duration duration(ToDoItem toDoItem) {
        throw new RuntimeException("ALERTA duración inestimable, el item no inició todavía!");
    }

}
