package com.ateraction.vesperanto;

public class Words2ImageResult implements Comparable<Words2ImageResult>{
	public int imageID=0; 
	public int wordsPosition=0;	
    public int wordLength=0;	
    public String word="";
public int compare(Words2ImageResult o1, Words2ImageResult o2) {
    return ((Integer) o2.wordsPosition).compareTo(o1.wordsPosition);
}

@Override
public int compareTo(Words2ImageResult another) {
	// TODO Auto-generated method stub
	
	
	int compareQuantity =(Integer) another.wordsPosition;// ((Words2ImageResult.this.wordsPosition) another).wordsPosition); 
	 
	//ascending order
	return ((Integer)this.wordsPosition) - compareQuantity;

	//descending order
	//return compareQuantity - this.quantity;
	//return 0;
}

}
