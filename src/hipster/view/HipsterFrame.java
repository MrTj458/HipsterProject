package hipster.view;

import javax.swing.JFrame;
import hipster.controller.HipsterController;
import javax.swing.JOptionPane;

public class HipsterFrame extends JFrame
{
	private HipsterController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterController baseController)
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
	
	public HipsterController getBaseController()
	{
		return baseController;
	}
}
