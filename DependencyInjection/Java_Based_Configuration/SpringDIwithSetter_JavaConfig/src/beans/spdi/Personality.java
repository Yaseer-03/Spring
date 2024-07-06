package beans.spdi;

public class Personality {
	private int height;
	private int weight;
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "\nHeight: " + height +"ft" + "\nWeight" + weight;
	}
}
