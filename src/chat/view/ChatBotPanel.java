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
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private SpringLayout baseLayout;
	
	public ChatBotPanel(ChatBotController baseController) 
	{
		this.baseController = baseController;
		sampleField = new JTextField(25);
		sampleButton = new JButton("click on me please ;D");
		chatArea = new JTextArea(5, 25);
		chatPane = new JScrollPane(chatArea);
		
		baseLayout = new SpringLayout();
		
		
		
		
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
		this.setBackground(Color.BLUE);
		this.setLayout(baseLayout);
		
		this.add(sampleButton);
		this.add(sampleField);
		this.add(chatPane);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, 27, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, sampleButton, -92, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 85, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -35, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, sampleField, 340, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatArea, 61, SpringLayout.SOUTH, sampleButton);
		baseLayout.putConstraint(SpringLayout.WEST, chatArea, 48, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatArea, -60, SpringLayout.NORTH, sampleField);
		baseLayout.putConstraint(SpringLayout.EAST, chatArea, 309, SpringLayout.WEST, this);
	}
	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				sampleField.setText(sampleField.getText() + ":O HOLY CRAP!");
			}
		});	
		
	}
}
