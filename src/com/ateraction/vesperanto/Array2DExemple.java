package com.ateraction.vesperanto;

import java.util.Arrays;
import java.util.Comparator;

public class Array2DExemple {
	 
	public static void main(String[] args) {
	String[][] data = new String[][] {
	{"voiture","camion","helicoptere"},
	{"chien","chat","tigre"},
	{"assiette","verre","fourchette"},
	{"patate","haricots","tomates"}
	};

	System.out.println("avant");
	println(data);

	data = mySort(data);

	System.out.println("après");
	println(data);

}

private static void println(String[][] data) {
	for(String[] line : data ) {
		System.out.println(Arrays.toString(line));
	}
}

private static String[][] mySort(String[][] data) {
	String[][] transposed = transpose(data);
	sort(transposed);
	return transpose(transposed);
}

private static void sort(String[][] data) {
	Arrays.sort(data, new Comparator<String[]>() {
		@Override
		public int compare(String[] a1, String[] a2) {
			return a1[0].compareTo(a2[0]);
		}
	});
}

private static String[][] transpose(String[][] data) {
	String[][] transposed = new String[data[0].length][data.length];
	for(int i=0; i<data.length; i++) {
		for(int j=0; j<data[i].length; j++) {
			transposed[j][i]=data[i][j];
		}
	}
	return transposed;
}

}