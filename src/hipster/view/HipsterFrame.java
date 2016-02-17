package hipster.view;

import javax.swing.JFrame;
import hipster.controller.HipsterAppController;
import javax.swing.JOptionPane;

/**
 * Contains all of the code for the HipsterFrame class.
 * @author thod0127
 * @version 0.1
 */
public class HipsterFrame extends JFrame
{
	private HipsterAppController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(800, 600);
		this.setTitle("Hipster Day!");
		this.setVisible(true);
	}
	
	public HipsterAppController getBaseController()
	{
		return baseController;
	}
}
