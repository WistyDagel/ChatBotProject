package chat.controller;

import chat.model.ChatBot;
import chat.view.ChatBotFrame;
import chat.view.ChatBotPanel;
import chat.view.ChatBotView;

/**
 * Application Controller is what runs the project. Controls the View and Model packages.
 * @author Chris Dazley
 * @version 
 */

public class ChatBotController 
{
	/**
	 * The GUI view for the application. 
	 */
	private ChatBotView appView;
	
	/**
	 * The Chatbot Model instance.
	 */
	private ChatBot notSoCleverBot;
	
	/**
	 * The startup message for the Chatbot application.
	 */
	private String startMessage;
	
	/**
	 * The ending message for the Chatbot.
	 */
	private String endMessage;
	
	/**
	 * GUI frame for the application.
	 */
	private ChatBotFrame baseFrame;
	
/**
 * Creates a ChatBotController and initializes the associated View and Model objects. 
  */
	public ChatBotController()
	{
		appView = new ChatBotView(this);
		baseFrame = new ChatBotFrame(this);
		notSoCleverBot = new ChatBot("Mr. not so clever");
		startMessage = "Welcome to the" + notSoCleverBot.getName() +" Chatbot, type in your name.";
	}
	
	
	
	/**
	 * Allows other objects access to the notSoCleverBot.
	 * @return The ChatBot for this App. 
	 */
	public ChatBot getNotSoCleverBot()
	{
		return notSoCleverBot;
	}
	
	pblic ChatbotFrame getBaseFrame()
	{
		return baseFrame;
	}
	/**
	 * Starts the ChatBot Application. 
	 */

	public void start()
	{
		/**
		 * Recommend doing this line of code to display the users text within the panel. 
		 */
		ChatBotPanel myAppPanel = (ChatBotPanel) baseFrame.getContentPane();
		myAppPanel.displayTextToUser(startMessage);
		
		//((ChatBotPanel) baseFrame.getContentPane()).displayTextToUser(startMessage);
	}
	/**
	 * Quits the Chatbot application with a message to the user that the application
	 */
	 private void quit()
	 {
	 	appview.displayInformation("Bye");
	 	System.exit(0);
	 }
	
	/**
	 * This method calls upon a response
	 */
	public String sendTextToChatBot(String userInput)
	{
		String respondText = "";
		
		respondText = notSoCleverBot.processedText(userInput);
		
		return respondText;
	}	
		
}
