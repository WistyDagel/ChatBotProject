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
	private JLabel lblTextHere;
	
	public ChatBotPanel(ChatBotController baseController) 
	{
		this.baseController = baseController;
		sampleField = new JTextField(25);
		sampleButton = new JButton("click on me please ;D");
		chatArea = new JTextArea(5,25);
		chatPane = new JScrollPane(chatArea);
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, 21, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleButton, 238, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatPane, -115, SpringLayout.NORTH, sampleField);
		baseLayout.putConstraint(SpringLayout.EAST, chatPane, -6, SpringLayout.WEST, sampleButton);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 25, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 19, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleField, 245, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, sampleField, -165, SpringLayout.EAST, this);
		
		
		
		
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
		
		lblTextHere = new JLabel("Text Here!!");
		baseLayout.putConstraint(SpringLayout.NORTH, lblTextHere, 248, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 6, SpringLayout.EAST, lblTextHere);
		baseLayout.putConstraint(SpringLayout.WEST, lblTextHere, 10, SpringLayout.WEST, this);
		lblTextHere.setForeground(Color.WHITE);
		add(lblTextHere);
		
		JButton btnNewButton = new JButton("Submit");
		baseLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 244, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, btnNewButton, 6, SpringLayout.EAST, sampleField);
		add(btnNewButton);
		
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
				sampleField.setText(sampleField.getText() + ":O HOLY CRAP!");
			}
		});	
		
	}
}
