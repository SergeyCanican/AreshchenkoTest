package task01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;


public class task01 {
	public static void main(String[] args) throws IOException {
		
		JFileChooser chooser = new JFileChooser();
		Scanner in = null;
		List<Integer> integers = new ArrayList<>();
		
		
		// user opens an input file
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File selectedFile = chooser.getSelectedFile();
			in = new Scanner(selectedFile);
			
			while(in.hasNext()) {
				if (in.hasNextInt()) {
					integers.add(in.nextInt());
				} else {
					in.next();
				}
			}
		}
		
		//integers.forEach(System.out::println);
		
		// sorting an arrayList so that we can calculate percentile and median
		integers.sort(null);
		
		if(integers.isEmpty()) {
			System.out.println("Please choose not an empty file!");
		} else {
			print(integers);
		}

	}
	
	private static void print(List<Integer> integers) {
		System.out.println("percentile <" + calculatePercentile(integers) + ">");
		System.out.println("median <" + calculateMedian(integers) + ">");
		System.out.println("average <" + calculateAverage(integers) + ">");
		System.out.println("max <" + calculateMax(integers) + ">");
		System.out.println("min <" + calculateMin(integers) + ">");
	}
	
	private static double calculatePercentile(List<Integer> numbers) {
		double percentile = 0.9;
		double index = 0;

		//System.out.println("Size: " + numbers.size());
		//numbers.forEach(System.out::println);
		
		index = (int) Math.ceil(percentile * numbers.size());

		return index;
	}
	
	private static double calculateMedian(List<Integer> numbers) {
		int middle = numbers.size() / 2;

		if (numbers.size() % 2 == 1) {
			return numbers.get(middle);
		} else {
			return (numbers.get(middle)+ numbers.get(middle-1)) / 2.0;
		}
		
	}
	
	private static double calculateAverage(List<Integer> numbers) {
		double avr = 0;
		
		for (Integer number: numbers) {
			avr += number;
		}
		avr = avr / numbers.size();
		
		return avr;
	}
	
	private static int calculateMax(List<Integer> numbers) {
		int max = Integer.MIN_VALUE;
		
		for (Integer number: numbers) {
			if(number > max)
				max = number;
		}
		
		return max;
	}
	
	private static int calculateMin(List<Integer> numbers) {
		int min = Integer.MAX_VALUE;
		
		for (Integer number: numbers) {
			if(number < min)
				min = number;
		}
		
		return min;
	}
}
