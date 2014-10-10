package chat.model;

import java.util.ArrayList;

public class ChatBot 
{
	private String name; 
	private int numberOfChats;
	private CharSequence contentArea;
	private String input;
	private ArrayList<String> memeList;
	
	/**
	 * Creates a ChatBot object with a specified name. Initializes the total chats to 0 
	 * @param name The name of the ChatBot 
	 */
	public ChatBot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		contentArea = "";
		memeList = new ArrayList<String>();
		fillTheMemeList();
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
	
	private void fillTheMemeList()	
	{
		
		memeList.add("I'm always watching you... alway's watching you...");
		memeList.add("Deal with it");
		memeList.add("I don't know who you are...");
		memeList.add("Why so serious?");
		memeList.add("one does not simply");
		memeList.add("You Shall Not PASS)");
		memeList.add("So you're telling me...");
	}
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false; 
		
		if(input != null && input.equals("quit"))
		{
			okToQuit = true;
		}
		
		return okToQuit; 
	}
	/**
	 * Processes the text within the string of the ChatBot
	 * @param userText The text displayed for the user
	 * @return Returns the text back to the user 
	 */
	public String pocessText(String userText)
	{
		String processedText = "";
		incrementChats();
		
		int randomChoice = (int) (Math.random() * 4);
		
		if (randomChoice == 0)
		{
			boolean isTooLong = false;
			
			if(input.length() >= 50)
			{
				isTooLong = true;
			}
		}
		else if (randomChoice == 1)
		{
			boolean hasMyContent = false;
			
			if(input.contains(contentArea))
			{
				hasMyContent = true;
			} 
		}
		else
		{
			if(memeChecker(userText))
			{
				processedText = "Hey Listen! You found a meme!" + userText;
				processedText += "that's really cool!";
			}
			else
			{
				processedText = "Oh too bad that wasn't a meme";
			}
		}
		
		
		return processedText;
	}
	/**
	 * Checks if the supplied String has the current amount of user inputs in the conversation
	 * @param input The user supplied String
	 * @return Whether the ChatBot's content area has reached its maximum input
	 */
	private boolean stringLengthChecker(String input)
	{
		boolean isTooLong = false;
		
		if(input.length() >= 50)
		{
			isTooLong = true;
		}
		
		return isTooLong;
	}
	
	/**
	 * Checks if the supplied String contains the content area of the ChatBot
	 * @param input The user supplied String
	 * @return Whether the ChatBot's special content area is inside the input String 
	 */
	private boolean contentChecker(String input) 
	{
		boolean hasMyContent = false;
		
		if(input.contains(contentArea))
		{
			hasMyContent = true;
		}
		
		return hasMyContent;
	}
	
	
	/**
	 * Checks to see if the supplied user text matches any of the memes in the ChatBot's meme list.
	 * @param currentText The user supplied text. 
	 * @return Whether the String matched any of the built in memes. 
	 */
	private boolean memeChecker(String currentText)
	{
		boolean isAMeme = false; 
		
		for(String currentMeme : memeList)
		{
			if(currentMeme.equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}
		
		for(int loopCount = 0; loopCount < memeList.size(); loopCount++)
		{
			if(memeList.get(loopCount).equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}
		
		return isAMeme;
	}

}

