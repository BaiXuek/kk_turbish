import java.awt.*;
public class Demo 
{
	public static void main(String[] args)
	{
		Frame W=new Frame();
		W.setBackground(Color.BLACK);
		W.setSize(1366,1366);
		W.setVisible(true);
		MyPanel mp=new MyPanel();
		W.add(mp);
	}
}
class MyPanel extends Panel
{
	public void paint(Graphics g)
	{
		g.drawLine(200, 200, 300, 300);
		g.setColor(Color.RED);
		g.drawRect(300,300,200,400);
		g.drawOval(300, 300, 200, 400);
		g.fillRect(500, 200, 300, 300);
		g.setColor(Color.GRAY);
		g.fillOval(800, 900, 300, 300);
		g.setColor(Color.GRAY);
		g.drawArc(500, 300, 600, 600, 30, 60);
		g.drawArc(500, 260, 600, 600, 15, 120);
	}

}
