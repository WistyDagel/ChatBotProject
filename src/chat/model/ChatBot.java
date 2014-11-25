package chat.model;

import java.util.ArrayList;

/**
 * Model Class for the Chatbot project. The chatbot has checker methods to
 * direct the output messages for the chatbot
 * @author cdaz6661
 *
 */
public class ChatBot
{
	private String name;
	private int numberOfChats;
	private int chatCount;
	private CharSequence contentArea;
	private String input;
	private ArrayList<String> userInputList;
	private ArrayList<String> memeList;
	private User myUser;

	/**
	 * Creates a ChatBot object with a specified name. Initializes the total
	 * chats to 0. Creates and fills the memelist
	 * 
	 * @param name
	 *            The name of the ChatBot
	 */
	public ChatBot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		contentArea = "";
		userInputList = new ArrayList<String>();
		memeList = new ArrayList<String>();
		fillTheMemeList();
		//this. means talk to the current class
	}

	/**
	 * It receives the name that has been assigned by the String
	 * 
	 * @return Returns set name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * It returns the number of chats that the ChatBot has initiated with the
	 * User
	 * 
	 * @return Current the number of chats
	 */
	public int getNumberOfChats()
	{
		return numberOfChats;
	}

	/**
	 * The setName allows the user to change the name of the ChatBot
	 * 
	 * @param name
	 *            New name of ChatBot
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * This increases the number of chat sequences, so the user is not
	 * experiencing the same chat over and over again
	 */
	public void incrementChats()
	{
		numberOfChats++;
	}

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

	/**
	 * Processes the text within the string of the ChatBot
	 * 
	 * @param userText
	 *            The text displayed for the user
	 * @return Returns the text back to the user
	 */
	public String processedText(String userText)
	{
		String processedText = "";
		
		if (userText != null && userText.length() > 0)
		{
			if (numberOfChats < 5)
			{
				processedText = introduceUser(userText);
			}
			else
			{
				processedText = randomChatTopic(userText);
			}
		}
		incrementChats();
		/**
		 * Avoids crashing on user input, makes sure the user doesn’t crash the
		 * program.
		 */
		return processedText;
	}	
	public String randomChatTopic2(String userText)
	{
		String processedText = "";
		String randomTopic = "";
		int randomChoice1 = (int) (Math.random() * 7);
		if (randomChoice1 == 0);
	
	if (userText != null)
	{
		if (numberOfChats < 5)
		{		
		
		if(numberOfChats == 0)
		{
			myUser.setName(userText);
			processedText = "Hello" + myUser.getName() + "what is your age?";
		}
		else if(numberOfChats == 1)
		{
			int age = Integer.parseInt(userText);
			myUser.setAge(age);
			processedText = "Hello" + myUser.getName() + "you are really" + myUser.getAge() +"years old?";
			processedText += "\nWhat is your favorite movie?";
		}
		else if(numberOfChats == 2)
		{
			myUser.setFavoriteMovie(input);
			String userInfoText = myUser.getName() + ", you really liked" + myUser.getFavoriteMovie();
			userInfoText += "??? Weird!\n Are you Blonde";
		}
		else if(numberOfChats == 3)
		{
			
		}
		else if(numberOfChats == 4)
		{
			
		}
		else if(numberOfChats == 5)
		{
			
		}
			if (randomChoice1 == 0)
			{
				if (stringLengthChecker(userText))
				{
					processedText = "That is too long for me to spend time on ;)";
				}
				else
				{
					processedText = "short messages are better for me";
				}
			}
			else if (randomChoice1 == 1)
			{
				if (contentChecker(userText))
				{
					processedText = "you know that the secret involves: " + userText;
				}
				else
				{
					processedText = "";
				}

			}

			else if (randomChoice1 == 2)
			{
				if (memeChecker(userText))
				{
					processedText = "Hey Listen! You found a meme!" + userText;
					processedText += "that's really cool!";
				}
				else
				{
					processedText = "Oh too bad that wasn't a meme";
				}
			}
			else if (randomChoice1 == 3)
			{
				if (chatCount < 10)
				{
					processedText = "";
				}
				//should store a string in processedText from another method say chooseRandomUserInfo(string)
			}
			else if (randomChoice1 == 4)
			{
				userInputList.add(0, userText);
				processedText = "Thanks for the input," + myUser.getName();
			}
			else if (randomChoice1 == 5)
			{
			 if (userInputChecker(userText))
				{
				 	processedText = "Yikes you knew what you said before!!!";
				}
			 else
			 	{
				 	processedText = "I don't think I have heard that before";  
			 	}
			}
			else if (randomChoice1 == 6)
			{
				Object randomTopic1;
				String userInput1 = null;
				if (chatbotNameChecker(userInput1))
				{
					randomTopic1 = chatbotNameConversation(userInput1);
				}
				else
				{
					randomTopic1 = noNameConversation(userInput1);
				}
			}
		
		incrementChats();	
		}
	}
		return processedText;	
}		
	private String introduceUser(String userText)
	{
		// TODO Auto-generated method stub
		return null;
	}

	private String randomChatTopic(String userText)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * tests the string based on the user input and returns it as true
	 * @param input of the User
	 * @return the amount of user input
	 */
	private boolean userInputChecker(String input)
	{
		boolean matchesInput = false;
		
		if(userInputList.size() > 0)
		{
			for(int loopCount = 0; loopCount < userInputList.size(); loopCount++)
			{
				if(input.equalsIgnoreCase(userInputList.get(loopCount)))
				{
					matchesInput = true;
					userInputList.remove(loopCount);
					loopCount--;
				}
			}
		}
		
		return matchesInput;
	}

	/**
	 * Checks if the supplied String has the current amount of user inputs in
	 * the conversation
	 * 
	 * @param input
	 *            The user supplied String
	 * @return Whether the ChatBot's content area has reached its maximum input
	 */
	private boolean stringLengthChecker(String input)
	{
		boolean isTooLong = false;

		if (input.length() >= 50)
		{
			isTooLong = true;
		}

		return isTooLong;
	}

	/**
	 * Checks if the supplied String contains the content area of the ChatBot
	 * 
	 * @param input
	 *            The user supplied String
	 * @return Whether the ChatBot's special content area is inside the input
	 *         String
	 */
	private boolean contentChecker(String input)
	{
		boolean hasMyContent = false;

		if (input.contains(contentArea))
		{
			hasMyContent = true;
		}

		return hasMyContent;
	}

	/**
	 * Checks to see if the supplied user text matches any of the memes in the
	 * ChatBot's meme list.
	 * 
	 * @param currentText
	 *            The user supplied text.
	 * @return Whether the String matched any of the built in memes.
	 */
	private boolean memeChecker(String currentText)
	{
		boolean isAMeme = false;

		for (String currentMeme : memeList)
		{
			if (currentMeme.equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}

		for (int loopCount = 0; loopCount < memeList.size(); loopCount++)
		{
			if (memeList.get(loopCount).equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}

		return isAMeme;
	}

	/**
	 * When the User is done using the program the quitChecker allows the user
	 * to quit with inputting a certain phrase
	 * 
	 * @param input
	 *            Input a certain phrase to quit program
	 * @return Returns to desktop and closes all java programs
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;

		if (input != null && input.equals("quit"))
		{
			okToQuit = true;
		}

		return okToQuit;
	}
	
	/**
	 * Checks to see if the name of the Chatbot is contained within the string supplied by the user.
	 * @param currentInput the user supplied String.
	 * @return Whether the name is inside or not.
	 */
	private boolean chatbotNameChecker(String currentInput)
	{
		boolean hasNameInString = false;
		
		if(currentInput.indexOf(this.getName()) > -1)
		{
			hasNameInString = true;
		}
		
		return hasNameInString;
	}
	
	private String chatbotNameConversation(String currentInput)
	{
		String nameConversation = "This is what you typed ater my name: ";
		
		nameConversation.concat(currentInput.substring(currentInput.indexOf(this.getName()) + this.getName().length(), currentInput.length() -1));
		
		return nameConversation;
	}
	
	private String noNameConversation(String currentInput)
	{
		String notNamed = "";
		
		int smallRandom = (int) (Math.random() * currentInput.length() / 2);
		int largerRandom = (int) (smallRandom + (Math.random() * currentInput.length() / 2) + 1);
		
		notNamed = "You didn't say my name so here is a special phrase: " + currentInput.substring(smallRandom, largerRandom);
		
		return notNamed;
	}
	
	
	
	
	
	

	
}
