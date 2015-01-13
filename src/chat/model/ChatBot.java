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
	/**
	* A list of input from the user to be used within the program.
	*/
	private ArrayList<String> userInputList;
	/**
	* A list of memes that the program can pull from when processing the text.
	*/
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
	public String processText(String currentInput)
	{
		String result = "";
		if (getChatCount() < 5)
		{
			result = introduceUser(currentInput);
		}
		else if (currentInput != null && currentInput.length() > 0)
		{
			result = randomChatConversation(currentInput);
		}
		else
		{
			result = "Pleas Use Some WORDS!";
			chatCount--;
		}
		updateChatCount();
		return result;
}
		
/**
* Introduces the user of the Chatbot and gathers information about them to
* be used later in the project.
*
* @param input
* The supplied answers to user information questions.
* @return The next question for the user of the Chatbot.
*/
	private String introduceUser(String userText)
	{
		String userQuestion = "";
	
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
		else if (getChatCount() == 2)
		{
			double userWeight = Double.parseDouble(input);
			myUser.setWeight(userWeight);
			userQuestion = "Yowsers! That is a lot less than The Statue of Liberty " + myUser.getUserName() + " do you have blonde hair?";
		}
		else if (getChatCount() == 3)
		{
			boolean userHair = Boolean.parseBoolean(input);
			myUser.setHasBlondeHair(userHair);
			userQuestion = "Some amazing or dissapointing comment about blonde hair" + myUser.getUserName() + " do you have a favorite movie?";
		}
		else
		{
			boolean userMovie = Boolean.parseBoolean(input);
			myUser.setFavoriteMovie(userMovie);
			userQuestion = "I love that movie! :D " + myUser.getUserName() + " What do you wanna talk about next???";
		}
		
		return userQuestion;
	}
	
	/**
	* Selects a random topic for the chatbot to talk about using the user's
	* input as a comment or reference in the topic.
	*
	* @param input
	* The user supplied input.
	* @return The next Chatbot conversation.
	*/
	private String randomChatTopic(String userText)
	{
		String conversation = "";
		int randomPosition = (int) (Math.random() * 7);
		if (randomPosition == 0)
		{
		if (stringLengthChecker(input))
		{
			conversation = "too long";
		}
		else
		{
			conversation = "short words";
		}
	}
	else if (randomPosition == 1)
	{
		if (contentChecker(input))
		{
			conversation = "yup you know the secret";
		}
		else
		{
			conversation = "try again another time";
		}
	}
	else if (randomPosition == 2)
	{
		if (memeChecker(input))
		{
			conversation = "Wow, " + input + " is a meme. Wahoo!";
		}
		else
		{
			conversation = "not a meme, try again";
		}
	}
	else if (randomPosition == 3)
	{
		conversation = userTopic(input);
	}
	else if (randomPosition == 4)
	{
		userInputList.add(input);
		conversation = "Thank you for the comment";
	}
	else
	{
		if (userInputChecker(input))
		{
			conversation = "That was nice - you removed it from the list";
		}
		else
		{
			conversation = "that wasn't in the conversation before";
		}
	}
	
	return conversation;
}
	
	/**
 	 * Provides output based on the ChatbotUser object. Uses a switch/case
 	 * structure for testing.
 	 *
  	 * @param userInput
 	 * The user input
 	 * @return Resulting conversation.
 	 */
	private String userTopic(String userInput)
	{
		String userBasedResponse = "";
	
		int randomUserTopic = (int) (Math.random() * 6);
	
		switch (randomUserTopic)
		{
		case 1:
			userBasedResponse = myUser.hasBlondeHair() + " is the response to having blonde Hair ";
			break;
		case 0:
			userBasedResponse = myUser.getUserName() + " is a funny name ";
			break;
		default:
			userBasedResponse = myUser.getAge() + " is way older than Gandalf!!";
			break;
	}
	
	return userBasedResponse;
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
	
	
	
	
	

	
}
