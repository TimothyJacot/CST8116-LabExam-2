
public class Fishnet {
	private int largeFishCount; // count of large fish in the catch
	private int mediumFishCount;// count of medium fish in the catch
	
	public Fishnet () {
		
	}
	// TODO: write the two-parameter Fishnet constructor below
	public Fishnet (int largeFishCount, int mediumFishCount) {
		this.largeFishCount = largeFishCount;
		this.mediumFishCount = mediumFishCount;
	}
	
	// getter for large fish count
	
	public double getLargeFishCount() { return largeFishCount; }
	// setter for large fish count
	public void setLargeFishCount(int largeFishCount) {
	this.largeFishCount = largeFishCount;
	}
	// getter for medium fish count
	public double getMediumFishCount() { return mediumFishCount; }
	// setter for medium fish count
	public void setMediumFishCount(int mediumFishCount) {
	this.mediumFishCount = mediumFishCount;
		}
	// TODO: write the calculateTotalValue() method in the space below:
	//Page 2 of 5
	public double calculateTotalValue() {
		double LargeTotalValue = largeFishCount*42.50;
		double MediumTotalValue = mediumFishCount*15.50;
		return LargeTotalValue + MediumTotalValue;
	}

}
