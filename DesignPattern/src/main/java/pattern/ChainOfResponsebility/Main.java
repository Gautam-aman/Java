package pattern.ChainOfResponsebility;

abstract class MoneyHandler {
    protected MoneyHandler nextHandler;
    MoneyHandler() {
        this.nextHandler = null;
    }

    void setNextHandler(MoneyHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract public void dispense(int amount);
}

class ThousandDispenser extends MoneyHandler {
    int numNotes;
    ThousandDispenser(int numNotes) {
        this.numNotes = numNotes;
    }

    @Override
    public void dispense(int amount) {
        if (amount <= 0) return;

        int notesNeeded = amount / 1000;
        if (notesNeeded > numNotes) {
            notesNeeded = numNotes;
            numNotes = 0;
        } else {
            numNotes -= notesNeeded;
        }

        if (notesNeeded > 0) {
            System.out.println("Dispensing " + notesNeeded + " x 1000");
        }

        int remAmount = amount - notesNeeded * 1000;
        if (remAmount > 0) {
            if (nextHandler != null) nextHandler.dispense(remAmount);
            else System.out.println("Amount cannot be dispensed (insufficient smaller notes). Remaining: " + remAmount);
        }
    }
}

class FiveHundredDispenser extends MoneyHandler {
    int numNotes;
    FiveHundredDispenser(int numNotes) {
        this.numNotes = numNotes;
    }

    @Override
    public void dispense(int amount) {
        if (amount <= 0) return;

        int notesNeeded = amount / 500;
        if (notesNeeded > numNotes) {
            notesNeeded = numNotes;
            numNotes = 0;
        } else {
            numNotes -= notesNeeded;
        }

        if (notesNeeded > 0) {
            System.out.println("Dispensing " + notesNeeded + " x 500");
        }

        int remAmount = amount - notesNeeded * 500;
        if (remAmount > 0) {
            if (nextHandler != null) nextHandler.dispense(remAmount);
            else System.out.println("Amount cannot be dispensed (insufficient smaller notes). Remaining: " + remAmount);
        }
    }
}

class HundredDispenser extends MoneyHandler {
    int numNotes;
    HundredDispenser(int numNotes) {
        this.numNotes = numNotes;
    }

    @Override
    public void dispense(int amount) {
        if (amount <= 0) return;

        int notesNeeded = amount / 100;
        if (notesNeeded > numNotes) {
            notesNeeded = numNotes;
            numNotes = 0;
        } else {
            numNotes -= notesNeeded;
        }

        if (notesNeeded > 0) {
            System.out.println("Dispensing " + notesNeeded + " x 100");
        }

        int remAmount = amount - notesNeeded * 100;
        if (remAmount > 0) {
            if (nextHandler != null) nextHandler.dispense(remAmount);
            else System.out.println("Amount cannot be dispensed (insufficient smaller notes). Remaining: " + remAmount);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MoneyHandler thousandDispenser = new ThousandDispenser(5);
        MoneyHandler fiveHundred = new FiveHundredDispenser(5);
        MoneyHandler hundredDispenser = new HundredDispenser(5);

        thousandDispenser.setNextHandler(fiveHundred);
        fiveHundred.setNextHandler(hundredDispenser);

        int amount = 2300;
        thousandDispenser.dispense(amount);
    }
}
