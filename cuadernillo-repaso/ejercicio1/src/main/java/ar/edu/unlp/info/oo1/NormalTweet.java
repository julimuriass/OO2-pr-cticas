package ar.edu.unlp.info.oo1;

import java.util.ArrayList;

public class NormalTweet extends Tweet {
    private int minChar;
    private int maxChar;
    private String body;
    private ArrayList<Retweet> retweets;

    public NormalTweet(String body) {
        this.minChar = 1;
        this.maxChar = 280;
        this.body = body;
    }

    public void delete() {
        if (!retweets.isEmpty()) {
            this.retweets.stream().forEach(rt -> rt.deleteRetweet());
        }
    }

    public void deleteRt(Retweet rt) {
        this.retweets.remove(rt);
    }
    
   
}
