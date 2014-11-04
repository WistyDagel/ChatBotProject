package chat.view;

import javax.swing.JFrame;

import chat.controller.ChatBotController;

import chat.controller.ChatBotRunner;

public class ChatBotFrame extends JFrame
{
	private ChatBotPanel basePanel;
	
	public ChatBotFrame(ChatBotController baseController) 
	{
		basePanel = new ChatBotPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setVisible(true);
	}

}
