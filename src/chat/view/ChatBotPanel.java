package chat.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chat.controller.ChatBotController;

public class ChatBotPanel extends JPanel
{
	private ChatBotController baseController;
	
	private JButton sampleButton;
	private JTextField sampleField;
	private JButton CapButton;
	private JTextField CapField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private SpringLayout baseLayout;
	private JLabel lblTextHere;
	private JLabel lblWelcomeToChatbot;
	
	public ChatBotPanel(ChatBotController baseController) 
	{
		this.baseController = baseController;
		sampleField = new JTextField(25);
		sampleField.setBackground(Color.YELLOW);
		sampleField.setForeground(Color.BLACK);
		sampleButton = new JButton("click on me please ;D");
		sampleButton.setForeground(Color.BLACK);
		chatArea = new JTextArea(5,25);
		chatArea.setBackground(Color.YELLOW);
		chatPane = new JScrollPane(chatArea);
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 19, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatPane, -127, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, -1, SpringLayout.NORTH, sampleField);
		baseLayout.putConstraint(SpringLayout.WEST, sampleButton, 6, SpringLayout.EAST, sampleField);
		baseLayout.putConstraint(SpringLayout.EAST, sampleField, -220, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 25, SpringLayout.WEST, this);
		
		
		
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupScrollPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
	}

	private void setupPanel()
	{
		this.setBackground(Color.RED);
		this.setLayout(baseLayout);
		
		this.add(sampleButton);
		this.add(sampleField);
		this.add(chatPane);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleField, 245, SpringLayout.NORTH, this);
		
		
		lblTextHere = new JLabel("Text Here!!");
		lblTextHere.setBackground(Color.YELLOW);
		baseLayout.putConstraint(SpringLayout.NORTH, lblTextHere, 248, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 6, SpringLayout.EAST, lblTextHere);
		baseLayout.putConstraint(SpringLayout.WEST, lblTextHere, 10, SpringLayout.WEST, this);
		lblTextHere.setForeground(Color.YELLOW);
		add(lblTextHere);
		
		lblWelcomeToChatbot = new JLabel("WELCOME TO CHATBOT!!!!!!");
		baseLayout.putConstraint(SpringLayout.SOUTH, chatPane, 0, SpringLayout.NORTH, lblWelcomeToChatbot);
		baseLayout.putConstraint(SpringLayout.NORTH, lblWelcomeToChatbot, 162, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, lblWelcomeToChatbot, -22, SpringLayout.NORTH, sampleButton);
		baseLayout.putConstraint(SpringLayout.WEST, lblWelcomeToChatbot, 97, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, lblWelcomeToChatbot, 272, SpringLayout.WEST, this);
		lblWelcomeToChatbot.setForeground(Color.YELLOW);
		add(lblWelcomeToChatbot);
		
	}
	
	private void setupLayout()
	{
	}
	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userTypedText = sampleField.getText();
				String chatbotResponse = baseController.sendTextToChatBot(userTypedText);
				displayTextToUser(userTypedText);
				displayTextToUser(chatbotResponse);
				sampleField.setText("");
			}
		});
		
	}

	public void displayTextToUser(String input)
	{
		chatArea.append("\n" + input);
	}
	
}

