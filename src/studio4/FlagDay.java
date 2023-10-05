package studio4;
import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;
public class FlagDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StdDraw.setPenColor( 195,177,225);
		StdDraw.filledRectangle(.5,.50,.3,.2);
		
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledCircle(.50, .50, .2);
		
		StdDraw.setPenColor(Color.black);
		StdDraw.filledCircle(.40, .50, .04);
		StdDraw.filledCircle(.61, .50, .04);
		StdDraw.filledCircle(.51, .46, .02);

		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledCircle(.51,.47,.02);
		
		StdDraw.setPenColor(Color.white);
		StdDraw.filledCircle(.40,.52,.01);
		StdDraw.filledCircle(.60,.52,.01);

		
	}

}
