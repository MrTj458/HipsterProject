package hipster.model;

/**
 * Contains all of the code for the Hipster clas.
 * @author thod0127
 * @version 0.2
 */
public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		
		setupArray();
		setupBooks();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "That is so mainstream!";
		hipsterPhrases[1] = "Insert sarcastic phrase here.";
		hipsterPhrases[2] = "I said 'lol' before anyone else";
		hipsterPhrases[3] = "I was into Minecraft before it was cool.";
	}
	
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		
		firstBook = new Book();
		firstBook.setAuthor("Thomas");
		firstBook.setTitle("HAHAHAHAHHA");
		firstBook.setSubject("Stuff");
		firstBook.setPageCount(51);
		firstBook.setPrice(1337.66);
		
		secondBook = new Book();
		secondBook.setAuthor("Adam");
		secondBook.setTitle("I hate everything!");
		secondBook.setSubject("Stupid");
		secondBook.setPageCount(183463);
		secondBook.setPrice(0.98);
		
		thirdBook = new Book();
		thirdBook.setAuthor("Ethan");
		thirdBook.setTitle("Kappa");
		thirdBook.setSubject("Stuff");
		thirdBook.setPageCount(1);
		thirdBook.setPrice(1.99);
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}
	
	public Book[] getHipsterBooks()
	{
		return hipsterBooks;
	}
	
	public void setHipsterBooks(Book[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
	
}
