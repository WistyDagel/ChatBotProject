package chat.controller;

import javax.swing.JOptionPane;

import chat.model.ChatBot;
import chat.view.ChatBotView;

public class ChatBotController 
{
	private ChatBotView appView;
	private ChatBot notSoCleverBot;
	
	/**
	 * Creates a ChatBotController and initializes the associated View and Model objects. 
	 */
	public ChatBotController()
	{
		appView = new ChatBotView(this);
		notSoCleverBot = new ChatBot("Mr. not so clever");
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
		String message = JOptionPane.showInputDialog(null, "Welcome to Chatbot, type in your name");
		
		while(!notSoCleverBot.quitChecker(message))
		{
			message = appView.displayChatBotConversations(message);
		}
		
		if(notSoCleverBot.quitChecker(message))
		{
			quit();
		}
		
		JOptionPane.showMessageDialog(null, "Wait! Don't go yet...");
	}
	
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "bye");
		System.exit(0);
	}
}
