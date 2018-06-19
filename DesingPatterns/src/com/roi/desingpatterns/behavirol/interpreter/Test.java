package com.roi.desingpatterns.behavirol.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Context context = new Context();
		context.setHexvalue("ABC");
		List<ITerminalExpression> expressions = new ArrayList<>();

		for (char item : context.getHexvalue().toCharArray()) {

			switch (item) {
			case 'A':
				expressions.add(new TerminalExpA());
				break;
			case 'B':
				expressions.add(new TerminalExpB());
				break;
			case 'C':
				expressions.add(new TerminalExpB());
				break;

			default:
				break;
			}

		}
		
		for (ITerminalExpression iTerminalExpression : expressions) {
		     iTerminalExpression.interpreter(context);	
		}
		
		System.out.println(context.getIntValue());

	}

}
