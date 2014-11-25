package chat.controller;

public class ChatBotRunner 
{
	/**
	 * Allows the chatbot name to be Established as new Chatbot variable
	 * @param args
	 */
	public static void main(String[]args)
	{
		ChatBotController appController = new ChatBotController();
		appController.start();
	}
	
}
