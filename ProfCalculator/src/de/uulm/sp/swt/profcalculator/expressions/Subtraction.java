package de.uulm.sp.swt.profcalculator.expressions;

public class Subtraction extends Expression{

	public Expression left;
	public Expression right;

	public Subtraction(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int evaluate() {
		return left.evaluate() - right.evaluate();
	}

	@Override
	public String toString(Expression parent, Kind kind) {
		// TODO Auto-generated method stub
		return left.toString(this, Kind.LEFT) + " - " + right.toString(this, Kind.RIGHT);
	}

}