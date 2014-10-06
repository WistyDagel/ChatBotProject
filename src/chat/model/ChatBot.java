package chat.model;

public class ChatBot 
{
	private String name; 
	private int numberOfChats;
	
	/**
	 * Creates a ChatBot object with a specified name. Initializes the total chats to 0 
	 * @param name The name of the ChatBot 
	 */
	public ChatBot(String name)
	{
		this.name = name;
		numberOfChats = 0;
	}
	
	/**
	 * It receives the name that has been assigned by the String
	 * @return Returns set name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * It returns the number of chats that the ChatBot has initiated with the User 
	 * @return Current the number of chats 
	 */
	public int getNumberOfChats()
	{
		return numberOfChats;
	}
	/**
	 * The setName allows the user to change the name of the ChatBot
	 * @param name New name of ChatBot
	 */
	public void setName(String name)
	{
		this.name = name; 
	}
	/**
	 * This increases the number of chat sequences, so the user is not experiencing the same chat over and over again  
	 */
	public void incrementChats()
	{
		numberOfChats++; 
	}
	/**
	 * When the User is done using the program the quitChecker allows the user to quit with inputting a certain phrase 
	 * @param input Input a certain phrase to quit program 
	 * @return Returns to desktop and closes all java programs
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false; 
		
		if(input != null && input.equals("quit"))
		{
			okToQuit = true;
		}
		
		return okToQuit; 
	}

}

