package chat.view;

import javax.swing.JOptionPane;

import chat.controller.ChatBotController;

public class ChatBotView 
{

	private ChatBotController baseController; 
	
	public ChatBotView(ChatBotController baseController)
	{
		this.baseController = baseController; 
	}
	 
	public String displayChatBotConversations(String input)
	{
		String output = "";
		
		output = JOptionPane.showInputDialog(null, baseController.getNotSoCleverBot().getName() + " says hello, " + input + " do you wish to continue");
		
		return output;
	}
	
	public void displayInformation(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
	
}
