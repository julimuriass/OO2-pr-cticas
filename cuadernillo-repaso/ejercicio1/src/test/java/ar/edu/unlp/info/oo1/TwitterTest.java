package ar.edu.unlp.info.oo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TwitterTest {
    Twitter twitter;

    @BeforeEach
    public void BeforeEach() {
        this.twitter = new Twitter();
    }
    
    @Test 
    public void addUser(){
        assertEquals(twitter.addUser("Pedo"), true);
        assertEquals(twitter.getUsers().size(), 1);
    }

    @Test
    public void tryToAddUserSameName() {
        twitter.addUser("culo");
        assertEquals(twitter.addUser("culo"), false);
        assertEquals(twitter.getUsers().size(), 1);


    }

    @Test
    public void deleteUser() {
        twitter.addUser("culo");
        assertEquals(twitter.deleteUser("culo"), true);
        assertEquals(twitter.getUsers().size(), 0);
    }
}
