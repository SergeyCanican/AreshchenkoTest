package task02;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class quadrangle {
	public static void main(String[] args) throws IOException {
			
		JFileChooser chooser = new JFileChooser();
		Scanner in = null;
		double[] coords = new double[8];
		
		
		// user opens an input file
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File selectedFile = chooser.getSelectedFile();
			in = new Scanner(selectedFile);
			
			int i = 0;
			while(in.hasNext()) {
				coords[i++] = in.nextDouble();

				System.out.println(i-1 + ". " + coords[i-1]);
			}
		}

		double x1 = coords[0], y1 = coords[1];
		double x2 = coords[2], y2 = coords[3];
		double x3 = coords[4], y3 = coords[5];
		double x4 = coords[6], y4 = coords[7];
		
		System.out.print("Coordinate X: ");
        BufferedReader readerX = new BufferedReader(new InputStreamReader(System.in));
        double x = readerX.read();

        System.out.print("Coordinate Y: ");
        BufferedReader readerY = new BufferedReader(new InputStreamReader(System.in));
        double y = readerY.read();
		
	}
}
