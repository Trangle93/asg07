
public class Square extends  Expression {
	public Expression expression;
	public Square(Expression a)
	{
		this.expression=a;
	}
	public String toString()
	{
		return String.format(expression + "^2 = " + evaluate());
	}
	public int evaluate() 
	{
		return (expression.evaluate()*expression.evaluate());
	}

}
