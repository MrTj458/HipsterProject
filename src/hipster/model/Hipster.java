package hipster.model;

/**
 * Contains all of the code for the Hipster clas.
 * @author thod0127
 * @version 0.1
 */
public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		
		setupArray();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "That is so mainstream!";
		hipsterPhrases[1] = "Insert sarcastic phrase here.";
		hipsterPhrases[2] = "lol";
		hipsterPhrases[3] = "I was into Minecraft before it was cool.";
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
	
}
