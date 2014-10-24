package chat.controller;

import javax.swing.JOptionPane;

import chat.model.ChatBot;
import chat.view.ChatBotFrame;
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
		//String message = JOptionPane.showInputDialog(null, "Welcome to Chatbot, type in your name");
		
//		while(!notSoCleverBot.quitChecker(message))
//		{
//			message = appView.displayChatBotConversations(message);
//			message = notSoCleverBot.processText(message);
//		}
		
		String message = appView.displayChatBotConversations(startMessage);
		
		while(!notSoCleverBot.quitChecker(message))
		{
			message = notSoCleverBot.processText(message);
			message = appView.displayChatBotConversations(message);
		}
		
		quit();
		
		//if(notSoCleverBot.quitChecker(message))
		//{
		//	quit();
		//}
		
		//JOptionPane.showMessageDialog(null, "Wait! Don't go yet...");
	
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
