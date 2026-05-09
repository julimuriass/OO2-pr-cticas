package ar.edu.unlp.info.oo1;

import java.time.Duration;
import java.time.LocalDate;

public class InProgress extends State {

    public void start(ToDoItem item) {} //Está bien que que no haga nada sea esto?

    public void togglePause(ToDoItem item) {
        item.detenerContador();
        item.changeState(new Paused());
    }
    
    public void finish(ToDoItem item) {
        item.detenerContador();
        item.changeState(new Finished());
    }

    public Duration duration(ToDoItem item) {
        Duration tiempoActual = Duration.between(item.getStartTime(), LocalDate.now());
        return item.getAcumulado().plus(tiempoActual);
    }
}
