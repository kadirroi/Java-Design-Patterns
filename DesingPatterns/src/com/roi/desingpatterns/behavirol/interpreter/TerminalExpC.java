package com.roi.desingpatterns.behavirol.interpreter;

public class TerminalExpC implements ITerminalExpression {

	@Override
	public void interpreter(Context context) {

		if (context != null && context.getHexvalue().contains("C")) {

			int currentValue = context.getIntValue();
			context.setIntValue(currentValue+=12);
		}
	}

}
