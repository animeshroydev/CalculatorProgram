package com.company;

public class DynamicHelper {

    private MathProcessing[] handlers;

    public DynamicHelper(MathProcessing[] handlers) {
        this.handlers = handlers;
    }

    public String process(String statement) {

        String[] part = statement.split(MathProcessing.SEPERATOR);
        String keyword = part[0];

        MathProcessing theHandler = null;
        for (MathProcessing handler : handlers){
            if (keyword.equalsIgnoreCase(handler.getKeyWord())) {
                theHandler = handler;
                break;
            }
        }
        double leftvalue = Double.parseDouble(part[1]);
        double rightValue = Double.parseDouble(part[2]);

        assert theHandler != null;
        double result = theHandler.doCalculation(leftvalue, rightValue);

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftvalue);
        sb.append(' ');
        sb.append(theHandler.getSymbol());
        sb.append(' ');
        sb.append(rightValue);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();

    }
}
