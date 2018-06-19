package com.roi.desingpatterns.behavirol.interpreter;

public class TerminalExpA implements ITerminalExpression {

	@Override
	public void interpreter(Context context) {
		if (context != null  && context.getHexvalue().contains("A")) {
			int currentValue = context.getIntValue();
			context.setIntValue(currentValue+=10);
		}
		
	}

}
