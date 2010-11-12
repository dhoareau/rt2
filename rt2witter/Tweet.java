import java.util.Date;


public class Tweet {
	char[] tweet ;
	Date date ; 
	//String user ;
	
	public Tweet(String t) throws TweetTooLongException {
		if (t.length() > 140) {
			throw new TweetTooLongException() ;
		} 
		this.tweet = t.toCharArray() ;
		this.date = new Date() ;
		
	}
	
	public Tweet(long time, String tweet) throws TweetTooLongException {
		this(tweet) ;
		this.date = new Date(time) ;
	}
	
	public long getTime() { return this.date.getTime() ; }
	public String tweetToString() { return new String(tweet) ; }
	
	public String toString() {
		return this.date.toString() + " - "+ new String(tweet) ;
	}
	
}
