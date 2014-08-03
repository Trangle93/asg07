
public class Multiplication extends BinaryExpression {
	public Multiplication(Expression a, Expression b)
	{
		super(a, b);
	}
	public String toString()
	{
		 return String.format(left + "*" + right +  " = " + evaluate() );
	} 
	public int evaluate() 
	{
		return (left.evaluate() * right.evaluate());
	}


}
