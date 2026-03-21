package ar.edu.unlp.info.oo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UserTest {
	User pepe, pio;
	NormalTweet t1, t2, t3;
	Retweet rt1, rt2;
	
	@BeforeEach
	void setUp() throws Exception {
		pepe = new User("Pepe");
		pio = new User("Pio");
	}
	
    @Test
    public void testCreateCorrectTweet() {
		assertEquals(pio.createTweet("h"), true );
		assertEquals(pio.getTweets().size(), 1);

		assertEquals(pepe.createTweet("hello"), true );
		assertEquals(pio.getTweets().size(), 1);

		assertEquals(pio.createTweet("En un rincón tranquilo de la ciudad, las ideas crecen despacio, como semillas curiosas. Cada palabra encuentra su lugar, cada pausa respira sentido. Escribir no es solo decir, es descubrir caminos nuevos, entre dudas, luces y silencios que también hablan. Siguen creciendo sin fin"), true );
		assertEquals(pio.getTweets().size(), 2);
	}

	@Test
    public void testCreateIncorrectTweet() {
		assertEquals(pio.createTweet(""), false );
		assertEquals(pio.getTweets().size(), 0);

		assertEquals(pio.createTweet("En un rincón tranquilo de la ciudad, las ideas crecen despacio, como semillas curiosas. Cada palabra encuentra su lugar, cada pausa respira sentido. Escribir no es solo decir, es descubrir caminos nuevos, entre dudas, luces y silencios que también hablan. Siguen creciendo sin fin."), false );
		assertEquals(pio.getTweets().size(), 0);
	}

	@Test
	public void testCreateRetweet() {
		t1 = new NormalTweet("Hello");
		pio.retweet(t1);
		assertEquals(pio.getTweets().size(), 1);
	}

	@Test 
	public void deleteUserTweets() {
		//Prepare the tweets.
		pio.createTweet("hello");
		pio.createTweet("hola");

		t1 = new NormalTweet("Hello");


	}
	

}
