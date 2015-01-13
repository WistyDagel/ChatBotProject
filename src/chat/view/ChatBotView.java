package chat.view;

import javax.swing.JOptionPane;

import chat.controller.ChatBotController;

/**
* Allows th user to view the ChatBot. Used for the GUI of the Chatbot
* @author Chris D
*
*/

public class ChatBotView 
{
	/**
	 * Model components can be accessed for display purposes.
	 */
	private ChatBotController baseController; 
	/**
	 * Creates the ChatbotView with a reference to the controller.
	 * @param The reference to the ChatbotController.
	 */
	public ChatBotView(ChatBotController baseController)
	{
		this.baseController = baseController; 
	}
	/**
	 * String from the Chatbot with the availability of user input.
	 * @param currentInput The used String.
	 * @return The users typed response.
	 */
	public String displayChatBotConversations(String input)
	{
		String output = "";
		
		output = JOptionPane.showInputDialog(null, baseController.getNotSoCleverBot().getName() + " says hello, " + input + " do you wish to continue");
		
		return output;
	}
	/**
	 * Shows a String from the Chatbot as a popup window.
	 * @param currentInput The string from the Chatbot.
	 */
	public void displayInformation(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
	
}
