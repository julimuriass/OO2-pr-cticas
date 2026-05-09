package ar.edu.unlp.info.oo1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class ToDoItemTest {
	
	ToDoItem pendingItem, inProgressItem, finishedItem, pausedItem;

	
	@BeforeEach
	void setUp() throws Exception {
		pendingItem = new ToDoItem("pedito");
		inProgressItem = new ToDoItem("caca");
		finishedItem = new ToDoItem("pedo");
		pausedItem = new ToDoItem("pito");

	}
	
    @Test
    public void testPending_InProgress() {
		pendingItem.start();
		assertEquals(pendingItem.getState() instanceof InProgress, true);
    }

	@Test
    public void testPending_Paused() {
		assertThrows(RuntimeException.class, () -> pendingItem.togglePause());
    }

	@Test
	public void testPending_Finished() {
		pendingItem.finish();
		assertEquals(pendingItem.getState() instanceof Pending, true); //El estado no cambia.
	}

	@Test
	public void testInProgress_Start() {
		inProgressItem.start();
		assertEquals(inProgressItem.getState() instanceof InProgress, true);
	}

	@Test
	public void testInProgress_Paused() {
		inProgressItem.start();
		inProgressItem.togglePause();
		assertEquals(inProgressItem.getState() instanceof Paused, true);
	}

	@Test
	public void testInProgress_Finish() {
		inProgressItem.start();
		inProgressItem.finish();
		assertEquals(inProgressItem.getState() instanceof Finished, true);
	}

	@Test
	public void testFinished_Paused() {
		finishedItem.start();
		finishedItem.finish();
		assertThrows(RuntimeException.class, () -> finishedItem.togglePause());
	}

	@Test
	public void testPaused_Finish() {
		pausedItem.start();
		pausedItem.togglePause();
		pausedItem.finish();
		assertEquals(pausedItem.getState() instanceof Finished, true);
	}

	@Test
	public void testPaused_InProgress() {
		pausedItem.start();
		pausedItem.togglePause();
		pausedItem.togglePause();
		assertEquals(pausedItem.getState() instanceof InProgress, true);
	}


	// Tests duración, sé que debería hacerlos separados, pero bueeeenoooo :p
	@Test 
	public void testDuration() {
		assertThrows(RuntimeException.class, () -> pendingItem.figureWorkedTime());

		pendingItem.start(); //Pasa a estar en estado InProgress.
		//Lo otro no puedo porque usa LocalDate.now() y eso cambia constantemente, qué va a ser...
	}
}
