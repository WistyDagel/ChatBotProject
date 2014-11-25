package chat.controller;

import javax.swing.JOptionPane;

import chat.model.ChatBot;
import chat.view.ChatBotFrame;
import chat.view.ChatBotPanel;
import chat.view.ChatBotView;

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
		
	
		String message = notSoCleverBot.processedText(startMessage);
		message = appView.displayChatBotConversations(message);
	
	}
	
	public String sendTextToChatBot(String userInput)
	{
		String respondText = "";
		
		respondText = notSoCleverBot.processedText(userInput);
		
		return respondText;
	}	
		
	
	/**
	 * Quits the Chatbot application with a message to the user that the application is closing 
	 */
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "bye");
		System.exit(0);
	}
}
