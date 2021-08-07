package de.uulm.sp.swt.profcalculator.expressions;

public class Addition extends Expression {
	
	public Expression left;
	public Expression right;

	public Addition(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public String toString(Expression parent, Kind kind) {
		return left.toString(this, Kind.LEFT) + " + " + right.toString(this, Kind.RIGHT);
	}

	public int evaluate() {
		return left.evaluate() + right.evaluate();
	}
	
}
