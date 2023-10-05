package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String name = in.next();
		
		double e = in.nextInt();
		double e2 = in.nextInt();
		double e3 = in.nextInt();
		
		boolean e4 = in.nextBoolean();
		
		double r1 =in.nextDouble();
		double r2 =in.nextDouble();
		double r3 =in.nextDouble();
		double r4 =in.nextDouble();

		
		StdDraw.setPenColor(Color.black);
		StdDraw.rectangle(r1, r2, r3, r4);
		
	}
}
