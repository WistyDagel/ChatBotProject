package chat.view;

import javax.swing.JFrame;

import chat.controller.ChatBotController;

import chat.controller.ChatBotRunner;

/**
* GUI Frame class for a Chatbot. Shows the basic framework code for a JFrame extension.
* @author Chris Dazley
* @version 
*/

public class ChatBotFrame extends JFrame
{
	/**
	 * Reference for the ChatbotPanel of the GUI.
	 */
	private ChatBotPanel basePanel;
	/**
	 * Creates a ChatbotFrame with a reference to the ChatbotAppController to pass to the panel.
	 * @param baseController The reference to the controller object.
	 */
	public ChatBotFrame(ChatBotController baseController) 
	{
		basePanel = new ChatBotPanel(baseController);
		setupFrame();
	}
	/**
	 * Helper method to load panel to set size, frame and visibility. 
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setVisible(true);
	}

}
