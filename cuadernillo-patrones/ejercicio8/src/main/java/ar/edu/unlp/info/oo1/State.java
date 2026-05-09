package ar.edu.unlp.info.oo1;

import java.time.Duration;

public abstract class State {
    protected ToDoItem context;

    public abstract void start(ToDoItem item);
    public abstract void finish(ToDoItem item);
    public abstract void togglePause(ToDoItem item);
    
    public void addComment(String comment) {
        this.context.addComment(comment);
    }

    public abstract Duration duration(ToDoItem toDoItem);
}
