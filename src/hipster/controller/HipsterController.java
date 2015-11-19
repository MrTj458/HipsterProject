package hipster.controller;

import hipster.view.HipsterFrame;
import hipster.model.Hipster;

/**
 * This class is the main controller for the program
 * @author thod0127
 * @version 0.2
 */
public class HipsterController
{
	private HipsterFrame baseFrame;
	private Hipster firstHipster;
	
	public HipsterController()
	{
		firstHipster = new Hipster();
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		String myName = baseFrame.getResponse("What your name?");
		if(myName != null && myName.length() >= 1)
		{
			firstHipster.setName(myName);
		}
		else
		{
			firstHipster.setName("User");
		}
		baseFrame.setTitle(firstHipster.getName() + "'s Hipster Project!");
	}
	
	
	public Hipster getFirstHipster()
	{
		return firstHipster;
	}
	
	public HipsterFrame getBaseFrame()
	{
		return baseFrame;
	}
}
