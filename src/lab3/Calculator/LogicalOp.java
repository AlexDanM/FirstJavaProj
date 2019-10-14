package lab3.Calculator;

public class LogicalOp {
    public String verifyText(String text) {

        if (text.equals("FastTrackj")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }
    }

    public String verifyTextAndNumber(String text, int x) {
        if (text.equals("FastTrackIT") && (x <= 3)) {
            return (text + " " + x);
        } else {
            return (x + " " + text);
        }
    }

    public int verifyNumber(int number) {
        if ((number >= 2) && (number <= 8)) {
            return (number);
        } else {
            return (0);
        }
    }

    public int calculatorAdunare(int x, int y, int result) {
        result = x + y;
        return result;
    }

    public int calculatorScadere(int x, int y, int result) {
        result = x - y;
        return result;
    }

    public int calculatorInmultire(int x, int y, int result) {
        result = x * y;
        return result;
    }

    public float calculatorImpartire(float x, float y, float result) {
        result = x / y;
        return result;
    }

    public int checkBiggerNumber(int x, int y) {
        if (x < y)
            return y;
        else
            return x;

    }

    public String snowMeter(int x) {
        if ((x > 8) || (x == 6)) {
            return ("The amount of snow this winter was(cm): " + x);
        } else {
            return ("The forecast snow is(cm): " + x);
        }
    }

    public String checkNumber(int x) {
        if ((x > 3) && (x != 4)) {
            return ("The number is greater than 3 and not equal to 4");
        } else if (x == 4) {
            return ("The number is equal to 4");
        } else
            return ("The number is lower than 3");
    }

    public String switchNumber(int x) {
        switch (x) {
            case 1:
                return ("The number is: 1");
            case 2:
                return ("The number is: 2");
            case 3:
                return ("The number is: 3");
            case 4:
                return ("The number is: 4");
            case 5:
                return ("The number is: 5");
            case 6:
                return ("The number is: 6");
            case 7:
                return ("The number is: 7");
            case 8:
                return ("The number is: 8");
            case 9:
                return ("The number is: 9");
            default:
                return ("Nice to meet you! :))");
        }
    }

    public String isNumberEven(int x) {
        if (x % 2 == 0) {
            return ("True");
        } else
            return ("False");
    }

    public String isEligibleToVote(int x) {
        if (x > 18) {
            return ("True");
        } else
            return ("False");
    }

    public int verifyBiggerNumber(int x, int y, int z) {
        if ((x > y) && (x > z)) {
            return x;
        } else if (y > z) {
            return y;
        } else
            return z;
    }
}



