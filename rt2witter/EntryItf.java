public interface EntryItf  {
	
	/**
	 * @return The name of the entry that will be displayed.
	 */
	public String getName() ;
	
	/**
	 * Launch the code related to the entry. This consists in
	 * defining what has to be done if any interaction is required
	 * with the user and what to do with user's inputs.
	 */
	public void launch();
	
	/**
	* Defines how the entry has to be displayed
	 */
	public void printEntry(); 
	
	/**
	 * The prompt that resides at the beginning at each entry. 
	 * for example in:
	 *      ?> enter your name:
	 * '?> ' is the prompt.
	 **/
	public void setPrompt(String prompt) ;
	
	/**
	 * @return the prompt.
	 **/
	public String getPrompt() ;
	
}