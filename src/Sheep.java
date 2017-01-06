///class Sheep that implements the Countable and Cloneable interfaces. 
	public class Sheep implements Countable,Cloneable {
	 //instance variables that store the count 
    //and the name of the sheep
	
	private int sheepCount=0;
	private String sheepName;
	
	//methods that can set and get the name of the sheep	
	public int getSheepCount() {
		return sheepCount;
	}

	public void setSheepCount(int sheepCount) {
		this.sheepCount = sheepCount;
	}

	public String getSheepName() {
		return sheepName;
	}

	public void setSheepName(String sheepName) {
		this.sheepName = sheepName;
	}
	
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}	

	@Override
	public void incrementCount() {
		sheepCount= sheepCount+1;
	}

	@Override
	public void resetCount() {
		sheepCount = 0;
	}

	@Override
	public int getCount() {		
		return sheepCount;
	}

	@Override
	public String getCountString() {
		return sheepCount+ " " + getSheepName() ;
	}
	
	

}
