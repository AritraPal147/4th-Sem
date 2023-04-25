class Time {
    int hours;
    int minutes;
    int seconds;
    
    Time(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("Invalid hours value: " + hours);
        }
        if (minutes < 0 || minutes > 60) {
            throw new MinException("Invalid minutes value: " + minutes);
        }
        if (seconds < 0 || seconds > 60) {
            throw new SecException("Invalid seconds value: " + seconds);
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}

public class Q5_CustomException {
    public static void main(String[] args) {
        try {
            Time time = new Time(25, 61, 61); 
        } catch (HrsException e) {
            System.out.println("Caught HrsException: " + e.getMessage());
        } catch (MinException e) {
            System.out.println("Caught MinException: " + e.getMessage());
        } catch (SecException e) {
            System.out.println("Caught SecException: " + e.getMessage());
        }
    }
}

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}
