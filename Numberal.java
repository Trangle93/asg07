
public class Numberal extends Expression {
private int value;
	
	public Numberal()
	{
		value = 0;
	}
	public Numberal(int a)
	{
		value = a;
	}
	public String toString() {
			return String.format("%d", value);
	}
	public int evaluate() {
		return value;
	}

}
