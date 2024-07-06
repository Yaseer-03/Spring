package beans.spwcjc;

public class Personality {
	private int height;
	private int weight;
	public Personality(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "\nHeight: " + height + "\nWeight" + weight;
	}

}
