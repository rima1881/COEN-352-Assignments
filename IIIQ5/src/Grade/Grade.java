package Grade;

public class Grade {

    public Grade(String symbol,String className) throws BadGradeException{

        if(!map.containsKey(symbol))
            throw new BadGradeException();

        this.symbol = symbol;
        this.className = className;
    }

    private static final GradeMap map = new GradeMap();

    private final String symbol;
    private final String className;

    public Double getValue(){
        return map.get(symbol);
    }

    @Override
    public String toString() {
        return className + ":\t" + symbol;
    }

    public static String PrintingGradingSystem(){
        return map.toString();
    }
}
