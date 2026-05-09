package ar.edu.unlp.info.oo1;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;


public class ToDoItem {
	private State state;
	private String name;
	private String comment;
	private Duration accumulated;
	private LocalDateTime startTime;

	public ToDoItem(String name) {
		this.name = name;
		this.state = new Pending();
		this.comment = null;
		this.accumulated = Duration.ZERO;
	}

	public State getState() { return this.state;}

	/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
	public void start() {
		this.state.start(this);
	}

	/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress sí * su estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
	public void togglePause() {
		this.state.togglePause(this);
	}


	/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
	public void finish() {
		this.state.finish(this);
	}


	/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* genera un error informando la causa específica del mismo.
	*/
	public Duration figureWorkedTime() {
		return this.state.duration(this);
	}

	public void iniciarContador() { 
		this.startTime = LocalDateTime.now();
	}

	public void detenerContador() {
		Duration transcurridos = Duration.between(startTime, LocalDateTime.now());
		this.accumulated = this.accumulated.plus(transcurridos);
	}


	public LocalDateTime getStartTime() { return startTime; }
	public Duration getAcumulado() { return accumulated; }
	/**
	* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."
	*/
	public void addComment(String comment) { this.comment = comment; }

	public void changeState (State state) { this.state = state; }

}
