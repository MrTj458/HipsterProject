package hipster.view;

import hipster.controller.HipsterController;
import hipster.model.Book;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Contains all of the code foor the HipsterPanel class.
 * @author thod0127
 * @version 0.2
 */
public class HipsterPanel extends JPanel
{
	private HipsterController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookSubjectLabel;
	private JLabel bookTitleLabel;
	private JLabel bookPriceLabel;
	private JButton changeBookButton;
	private int maxClicks;
	private int startClick;
	
	public HipsterPanel(HipsterController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		phraseComboBox = new JComboBox<String>();
		bookPageCountLabel = new JLabel("The  count");
		bookAuthorLabel = new JLabel("The author");
		bookSubjectLabel = new JLabel("The subject");
		bookTitleLabel = new JLabel("The title");
		bookPriceLabel = new JLabel("The price");
		changeBookButton = new JButton("Change Books");
		maxClicks = baseController.getFirstHipster().getHipsterBooks().length;
		startClick = 0;

		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(phraseComboBox);
		this.add(bookPageCountLabel);
		this.add(bookAuthorLabel);
		this.add(bookSubjectLabel);
		this.add(bookTitleLabel);
		this.add(bookPriceLabel);
		this.add(changeBookButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, bookPriceLabel, 6, SpringLayout.SOUTH, bookPageCountLabel);
		baseLayout.putConstraint(SpringLayout.EAST, bookPriceLabel, 0, SpringLayout.EAST, bookPageCountLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, phraseComboBox, -4, SpringLayout.NORTH, bookTitleLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, bookAuthorLabel, 6, SpringLayout.SOUTH, bookTitleLabel);
		baseLayout.putConstraint(SpringLayout.EAST, bookAuthorLabel, 0, SpringLayout.EAST, bookTitleLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, bookTitleLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, bookTitleLabel, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, bookPageCountLabel, 6, SpringLayout.SOUTH, bookSubjectLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, bookSubjectLabel, 6, SpringLayout.SOUTH, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.EAST, bookSubjectLabel, 0, SpringLayout.EAST, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.EAST, bookPageCountLabel, 0, SpringLayout.EAST, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.WEST, phraseComboBox, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, changeBookButton, 6, SpringLayout.SOUTH, bookPriceLabel);
		baseLayout.putConstraint(SpringLayout.EAST, changeBookButton, 0, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int red = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				setBackground(new Color(red,blue,green));
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
			}
		});
		
		changeBookButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Book [] tempBooks = baseController.getFirstHipster().getHipsterBooks();
				if(startClick < maxClicks)
				{
					bookSubjectLabel.setText("Book subject: " + tempBooks[startClick].getSubject());
					bookAuthorLabel.setText("Book author: " + tempBooks[startClick].getAuthor());
					bookTitleLabel.setText("Book title: " + tempBooks[startClick].getTitle());
					bookPageCountLabel.setText("Book pages: " + tempBooks[startClick].getPageCount());
					bookPriceLabel.setText("Book price: " + tempBooks[startClick].getPrice());
					startClick++;
				}
				else
				{
					startClick = 0;
					bookSubjectLabel.setText("Book subject: ");
					bookAuthorLabel.setText("Book author: ");
					bookTitleLabel.setText("Book title: ");
					bookPageCountLabel.setText("book pages: ");
					bookPriceLabel.setText("Book Price: ");
				}
			}
		});
	}
}
