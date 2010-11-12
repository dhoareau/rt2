
/**
 * Interface specifiyng the required methods for the manipulation
 * of a user account
 * 
 * @author Didier Hoareau
 *
 */
public interface UserItf {

	// return the login of the user. 
	public String getLogin() ;
	
	// return the password of the user
	public String getPassword() ;
	
	// return an array of logins corresponding to the
	// user's followings
	public String[] getFollowings() ;
	
	// return an array of logins corresponding to the
	// user's followers
	public String[] getFollowers() ;
	
	// add a new follower (its login) to the array 
	// the user's followers
	public void addFollower(String newFollower) ;
	
	// add a new follower (its login) to the array 
	// the user's followers
	public void addFollowing(String newFollowing) ;

	// return the array of the tweets the user has emitted
	// as String objects
	public String[] getAllTweetAsString() ;
	
}
