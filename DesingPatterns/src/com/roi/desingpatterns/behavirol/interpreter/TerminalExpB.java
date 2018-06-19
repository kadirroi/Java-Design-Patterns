package com.roi.desingpatterns.behavirol.interpreter;

public class TerminalExpB implements ITerminalExpression {

	@Override
	public void interpreter(Context context) {
 
		if (context !=  null && context.getHexvalue().contains("B")) {
            int currentValue = context.getIntValue();              			 
		    context.setIntValue(currentValue+=11);
		}
	}

}
