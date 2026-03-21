package ar.edu.unlp.info.oo1;

public class Retweet extends Tweet {
    private NormalTweet originalTweet;

    public void delete() {
        this.originalTweet.deleteRt(this);
        deleteRetweet();
    }

    public void deleteRetweet() {
        this.owner.deleteTweet(this);
    }
    
}
