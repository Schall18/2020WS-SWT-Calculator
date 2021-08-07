package de.uulm.sp.swt.profcalculator.expressions;

public class NecessaryBrackets extends Expression {

	private Expression expression;

	public NecessaryBrackets(Expression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString(Expression parent, Kind kind) {
		String childString = expression.toString(parent, Kind.LEFT);
		if (parent instanceof Multiplication && (expression instanceof Addition || expression instanceof Subtraction)) {
			childString = "(" + childString + ")";
		}
		if (parent instanceof Subtraction && (kind == Kind.RIGHT && (expression instanceof Addition || expression instanceof Subtraction))) {
			childString = "(" + childString + ")";
		}
		return childString;
	}

	@Override
	public int evaluate() {
		return expression.evaluate();
	}

}
