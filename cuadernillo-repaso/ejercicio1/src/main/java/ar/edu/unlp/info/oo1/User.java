package ar.edu.unlp.info.oo1;

import java.util.ArrayList;

public class User {
    private String screenName;
    private ArrayList<Tweet> tweets;

    public User(String screenName) {
        this.screenName = screenName;
        this.tweets = new ArrayList<>();
    } 

    public boolean createTweet(String body) {
        if (body.length() < 1 || body.length() > 280) {
            System.out.println("The lenght parameters for the text are not met.");
            return false;
        }

        Tweet newTweet = new NormalTweet(body);
        this.tweets.add(newTweet);
        return true;
    }

    public void retweet(Tweet tweet) { 
        this.tweets.add(tweet);
    }
    
    public void deleteTweet(Tweet tweet) {
        if (this.tweets.contains(tweet)) {
            this.tweets.remove(tweet);
        }
    }

    public void deleteTweets() {
       this.tweets.stream().forEach(t -> t.delete());
       this.tweets.clear();
    }

    public String getScreenName() { return this.screenName;}

    public ArrayList<Tweet> getTweets() { return this.tweets;}
}
